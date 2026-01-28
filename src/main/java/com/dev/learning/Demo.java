package com.dev.learning;
import java.sql.*;
import java.util.*;

class DemoClass {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/org";
        String username = "root";
        String password = "Saurabh@123";
        String query = "SELECT * FROM worker";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        List<Worker> workers = new ArrayList<>();

        while (rs.next()) {
            Worker worker = new Worker(
                    rs.getInt("Worker_id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getInt("salary"),
                    rs.getString("department")
            );
            workers.add(worker);
        }

        // print data
        for (Worker w : workers) {
            System.out.println(
                    w.getWorkerId() + " | " +
                            w.getFirstName() + " | " +
                            w.getLastName() + " | " +
                            w.getSalary() + " | " +
                            w.getDepartment()
            );
        }

        rs.close();
        st.close();
        con.close();
    }
}
