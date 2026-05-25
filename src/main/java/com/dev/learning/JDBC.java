package com.dev.learning;
import java.sql.*;

class DemoClass {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/org";
        String username = "root";
        String password = "xyz"; // your real password
        String query = "select * from worker";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from worker");

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " " +
                            rs.getString("sname") + " " +
                            rs.getString("sage")
            );
        }

        rs.close();
        st.close();
        con.close();
    }
}