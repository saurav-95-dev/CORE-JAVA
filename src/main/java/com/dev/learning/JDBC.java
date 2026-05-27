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
        String query = "update Student set sage = 29 where id = 2";
        int rowsAffected = st.executeUpdate(query);
        if(rowsAffected == 0){
            System.out.println("No rows affected");
        }
        else{
            System.out.println("Updation successful " + rowsAffected + " affected");
        }

        st.close();
        con.close();
    }
}