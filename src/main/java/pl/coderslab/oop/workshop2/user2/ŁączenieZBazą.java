package pl.coderslab.oop.workshop2.user2;

import pl.coderslab.oop.workshop2.db.DBUtil;
import pl.coderslab.oop.workshop2.user.User;

import java.sql.*;

public class ŁączenieZBazą {

    private static final String url = "jdbc:mysql://localhost:3306/workshop2?useSSl=false&characterEncoding=utf8";
    private static final String user = "root";
    private static final String password = "coderslab";

    public static void main(String[] args) {

        String createTable = "create table animalss (animal_id int auto_increment, animal_name varchar(255), animal_email varchar(255) unique, primary key(animal_id) )";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            // za pomocą executeQuery możemy w Stringu cale polecenie sql wysłać do sql
            //statement.executeUpdate(createTable);
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users where username = ?");
            preparedStatement.setString(1,"ira");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                String name = rs.getString("username");
                int id = rs.getInt("id");
                System.out.println(id + " " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
