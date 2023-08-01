package pl.coderslab.oop.workshop2.user2;

import pl.coderslab.oop.workshop2.db.DBUtil;
import pl.coderslab.oop.workshop2.user.User;
import pl.coderslab.oop.workshop2.user.UserDao;

import java.sql.*;


public class CreateInsertTable {
    //private static final String sql ="create table meble (subscriberId int auto_increment, name varchar(255),primary key (subscriberId))";

    public static void main(String[] args) {

        System.out.println(id("komoda",8));
    }

    public static int id(String name, int subscriberId) {
        String sqlCreate = "create table meble (subscriberId int auto_increment, name varchar(255),primary key (subscriberId))";

        int id = -1;
        Connection connection = null;
        String sql = "INSERT INTO meble (name, subscriberId) VALUES (?,?)";
        try {
            connection = DBUtil.getConnection();
            Statement st = connection.createStatement();
            PreparedStatement pstmt = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            //st.executeUpdate(sqlCreate);

            pstmt.setString(1, name);
            pstmt.setInt(2, subscriberId);
            pstmt.executeUpdate();

            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
                System.out.println("Inserted ID: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return id;
    }
}

