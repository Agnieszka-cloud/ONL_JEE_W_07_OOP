package pl.coderslab.oop.workshop2.user;

import java.sql.*;

public class CreateTable {
    private static final String url ="jdbc:mysql://localhost:3306/workshop2?useSSl=false&characterEncoding=utf8";
    private static final String login = "root";
    private static final String password = "coderslab";

    public static void main(String[]args){

        String sql = "create table users (id int(11) not null, username varchar(255), password varchar(255), email varchar(255))";

        String sqlAlter = "ALTER TABLE users MODIFY COLUMN id int primary key ";

        String sqlAlterIncrement = "ALTER TABLE users MODIFY COLUMN id int auto_increment ";

        String sqlAlterUnique = "ALTER TABLE users MODIFY COLUMN password varchar(255) unique key ";

        //  ALTER TABLE `users`
        //
        //  ADD PRIMARY KEY (`id`),
        //
        //  ADD UNIQUE KEY `email` (`email`);


        /*CREATE TABLE `users` (

  `id` int(11) NOT NULL,

  `username` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,

  `email` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,

  `password` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL

)*/
        //int id = 2; // numer wiersza do w sql do usunięcia
        /*String symbol1 = "'christmas tree', ";
        String carol1 ="'silent night', ";
        String meal1 = "'borsch'";
        String symbol2 = "snow";
        String carol2 = "jingle bell";
        String meal2 = "ginger bread";*/
        /*String insert1 = "insert into christmas (symbols, carols, meals) values (" + symbol1 +  carol1 + meal1 +  ");";
        String deleteId = " delete from christmas where id = ?";
        String insert2 = "insert into christmas (symbols, carols, meals) values (" + "\'" + symbol2 + "\', \'" + carol2 +  "\', \'" + meal2 + "\' " + ");";*/
        try
                (Connection connection = DriverManager.getConnection(url,login,password);
                 Statement statement = connection.createStatement())
        {
            //PreparedStatement preparedStatement = connection.prepareStatement(deleteId);
            //statement.executeUpdate(sql);
            //statement.executeUpdate(sqlAlter);
            //statement.executeUpdate(sqlAlterIncrement);
            statement.executeUpdate(sqlAlterUnique);
            //statement.executeUpdate(insert1);
            //statement.executeUpdate(insert2);
            //preparedStatement.setInt(1,id);
            //preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
