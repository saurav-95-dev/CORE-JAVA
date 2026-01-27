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
        ResultSet rs = st.executeQuery(query);

        if (rs.next()) {
            String firstName = rs.getString("first_name");
            System.out.println(firstName);
        }

        rs.close();
        st.close();
        con.close();
    }
}