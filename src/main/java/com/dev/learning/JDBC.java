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
        Statement st = con.createStatement();
        String query = "insert into Student (id , sname , sage , scity) values (2,'Rahul',22,'Waasepur')";
        int rowsAffected = st.executeUpdate(query);
        if(rowsAffected == 0) {
            System.out.println("Unable to insert record");
        }
        else{
            System.out.println("Record inserted successfully");
        }

        st.close();
        con.close();
    }
}