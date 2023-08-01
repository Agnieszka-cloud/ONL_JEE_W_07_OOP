package pl.coderslab.oop.workshop2.user;
import org.mindrot.jbcrypt.BCrypt;
import pl.coderslab.oop.workshop2.db.DBUtil;
import java.sql.*;
import java.util.Arrays;

public class UserDao {
    // atrybuty klasy Userdao
    private static final String INSERT_QUERY = "INSERT INTO users(username, email, password) VALUES (?,?,?)";
    private static final String SELECT_QUERY = "SELECT * FROM users WHERE id = ?";
    private static final String SELECT_ALL_QUERY = "SELECT * FROM users";
    private static final String UPDATE_QUERY = "UPDATE users SET  username = ?, email = ?, password = ?  WHERE id = ?";
    private static final String ALTER_QUERY = "ALTER TABLE users MODIFY COLUMN id int auto_increment";
    //private static final String ALTER_QUERY = "ALTER TABLE users MODIFY COLUMN password varchar(255) unique";
    //ALTER TABLE tbl AUTO_INCREMENT = 100;ALTER TABLE Animal
    //ADD UNIQUE Animal.AnimalType_id int
    //ALTER TABLE `workshop2`.`users`
    //ADD UNIQUE INDEX `password_UNIQUE` (`password` ASC) VISIBLE;
    //;
    public User create(User user){
        try(Connection connection = DBUtil.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY, PreparedStatement.RETURN_GENERATED_KEYS);
            //PreparedStatement pstmt = connection.prepareStatement(ALTER_QUERY);
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3,hashPassword(user.getPassword()));
            preparedStatement.executeUpdate();
            //pstmt.executeUpdate();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            if(rs.next()){
                int id = rs.getInt(1);
                user.setId(rs.getInt(1));
                System.out.println("Inserted ID: " + id);
            }
            return user;
            // zrób metodę że jeśli hasło sie powtarza stwórz nowe
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("hasło się powtarza");
            return null;
        }

    }

    public User read(int userId){
        try( Connection connection = DBUtil.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_QUERY);
            preparedStatement.setInt(1,userId);
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String password = rs.getString("password");
                return new User(id, username, email, password);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return  null;
    }

    public User[] findAll(){
        try (Connection connection = DBUtil.getConnection()){
            User[] allUsers = new User[0];
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_QUERY);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                allUsers = addToArray(allUsers, user);
            }
            return allUsers;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return  null;
    }
    private User[] addToArray( User[] users, User u ){
        User[] temporary = Arrays.copyOf(users,users.length + 1);
        temporary[users.length] = u;
        return temporary;
    }

    public void delete(int userId){
        try (Connection connection = DBUtil.getConnection()){
            DBUtil.remove(connection,"users",userId);
            System.out.println("user nr: " + userId + " has been successfully deleted");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void update(User user){
        try(Connection connection = DBUtil.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY);

            preparedStatement.setString(1, user.getUsername());

            preparedStatement.setString(2, user.getEmail());

            preparedStatement.setString(3, user.getPassword());

            preparedStatement.setInt(4, user.getId());

            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
}
