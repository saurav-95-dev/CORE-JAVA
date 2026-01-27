package com.dev.learning;
import java.sql.*;

class DemoClass {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/org";
        String username = "root";
        String password = "Saurabh@123"; // your real password
        String query = "select * from worker";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from worker");

        while (rs.next()) {
            System.out.println(
                    rs.getInt("Worker_id") + " " +
                            rs.getString("first_name") + " " +
                            rs.getString("last_name")
            );
        }

        rs.close();
        st.close();
        con.close();
    }
}