//INSERTING VALUES INTO DB USING PREPARED STATEMENT(When the query is fixed and the values are dynamic)
//NOTE : When using prepared statement - don't pass query inside executeUpdate(), it should be passed only inside the preparedStatement()
package com.dev.learning;

import java.sql.*;

class DemoClass{
    public static void main(String[] args) throws Exception {
        System.out.println("INSERTION IN DB VIA JDBC:");
        System.out.println();
        String username = "root";
        String password = "Saurabh@123";
        String first_name = "Villan";
        String last_name = "Kumar";
        int Worker_id = 67;
        String query = "select * from worker";
        String newInsertQuery =
                "INSERT INTO worker (first_name, last_name, salary, joining_date, department) " +
                        "VALUES (?, ?, ?, ?, ?)";

        String url = "jdbc:mysql://localhost:3306/org";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement st = con.prepareStatement(newInsertQuery);
        st.setString(1, first_name);
        st.setString(2, last_name);
        st.setInt(3, 60000);
        st.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
        st.setString(5, "Developer");
        int numberOfRowsEffected = st.executeUpdate();
        System.out.println(numberOfRowsEffected + " rows affected.");
        st.close();
        con.close();
    }
}