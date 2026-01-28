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
        query = "SELECT * FROM worker";

        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            int id = rs.getInt("Worker_id");
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            int salary = rs.getInt("salary");
            String department = rs.getString("department");

            System.out.println(
                    id + " | " + firstName + " | " + lastName + " | " + salary + " | " + department
            );
        }

    }
}