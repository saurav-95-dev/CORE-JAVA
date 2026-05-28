package com.dev.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    static{
        //1)Load and Register the driver:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection() throws SQLException {
        //2)Establishing the connection:
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String username = "root";
        String password = "Saurabh@123"; // your real password
        return DriverManager.getConnection(url, username, password);
    }
    public static closeConnection(){

    }
}