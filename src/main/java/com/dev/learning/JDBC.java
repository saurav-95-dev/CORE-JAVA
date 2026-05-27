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
        String query = "select * from Student";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("sname");
            int age = rs.getInt("sage");
            String address = rs.getString("scity");
            System.out.println(id + " " + name + " " + age + " " + address);
        }
        rs.close();
        st.close();
        con.close();
    }
}