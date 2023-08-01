package pl.coderslab.oop.workshop2.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/workshop2?useSSl=false&characterEncoding=utf8";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "coderslab";
    private static final String DELETE_QUERY = "DELETE FROM tableName where id = ? ";

    // łączenie sie z bazą danych
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
    }

    public static void remove(Connection getConnection, String tableName, int id){
        try(PreparedStatement preparedStatement = getConnection.prepareStatement(DELETE_QUERY.replace("tableName", tableName))) {
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}