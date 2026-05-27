package  com.dev.learning;
import java.sql.*;
public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1)Load and Register the driver:
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2)Establishing the connection:
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String username = "root";
        String password = "Saurabh@123"; // your real password
        Connection con = DriverManager.getConnection(url, username, password);
        //Create statement :
        Statement st = con.createStatement();
        //execute logic :
        String query = "delete from Student where id = 2";
        int rows = st.executeUpdate(query);
        if (rows == 0) {
            System.out.println("deletion failed");
        }
        else{
            System.out.println("deletion successful");
        }
        st.close();
        con.close();
    }
}