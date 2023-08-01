package pl.coderslab.mysql.create;

public class Main03 {
    private static final String Query2 = "create table products_aga (\n" +
            "   id int primary key auto_increment,\n" +
            "   name varchar(255),\n" +
            "   description varchar(255),\n" +
            "   price decimal(5,2)\n" +
");";
    private static final String Query3 = "create table orders (\n" +
            "    id int primary key auto_increment,\n" +
            "    description varchar(255)\n" +
            ");";
    private static final String Query4 = "create table clients (\n" +
            "    id int primary key auto_increment,\n" +
            "    name varchar(50),\n" +
            "    surname varchar(50)\n" +
            ");";
    public static void main(String[] args) {
    }
}
