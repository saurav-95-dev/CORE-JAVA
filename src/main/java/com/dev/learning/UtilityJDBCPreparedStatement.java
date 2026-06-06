package com.dev.learning;

import java.sql.*;

class UtilityJDBCPreparedStatement {
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    //support methods:
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String username = "root";
        String password = "xyz"; // your real password
        return DriverManager.getConnection(url, username, password);
    }
    public static void closeConnection(Connection con , PreparedStatement ps) throws SQLException {
        ps.close();
        con.close();

    }
}