package  com.dev.learning;
import java.sql.*;
public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/org";
        String username = "root";
        String password = "Saurabh@123"; // your real password
        String query = "select * from worker";

        Connection con = DriverManager.getConnection(url, username, password);

    }
}