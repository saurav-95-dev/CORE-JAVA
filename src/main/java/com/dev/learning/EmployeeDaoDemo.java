package com.dev.learning;

import java.sql.*;

public class EmployeeDaoDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("FETCH OPERATION:");
        EmployeeDao dao = new EmployeeDao();
        dao.connect();
        Employee e1 = dao.getEmployee(2);
        System.out.println(e1.worker_id + " " + e1.first_name + " " + e1.last_name);
        System.out.println("Adding a new entry:");
        Employee e2 = dao.addEmployee(77 , "kuch bhi" ,"nahi" , 40000);
        System.out.println(e2.worker_id + " " + e2.first_name + " " + e2.last_name);
        System.out.println("Update operation");
        Employee e3 = dao.updateEmployee(75 , "hard" , "khalnayak");
        System.out.println(e3.worker_id + " " + e3.first_name + " " + e3.last_name + " updated");
        System.out.println("Remove operation:");
        Employee e4 = dao.remove(5);
        System.out.println(e4.first_name + " " + e4.last_name + " has been removed");
    }
}

class EmployeeDao {
        Connection con = null;

        public void connect() throws Exception {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/org", "root", "Saurabh@123");
        }
        //fetch operation:
        public Employee getEmployee(int worker_id) throws Exception {
            String query = "select * from worker where worker_id = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1 , worker_id);
            ResultSet rs = st.executeQuery();
            Employee e = new Employee();
            if (rs.next()) {
                e.worker_id = rs.getInt("worker_id");
                e.first_name = rs.getString("first_name");
                e.last_name = rs.getString("last_name");
            }
            return e;
        }
        //insert/add operation:

        public Employee addEmployee(int worker_id , String first_name , String last_name , int salary) throws Exception {
              String query = "INSERT INTO worker (worker_id, first_name, last_name, salary) VALUES (?, ?, ?, ?)";
              PreparedStatement st = con.prepareStatement(query);
              st.setInt(1 , worker_id);
              st.setString(2 , first_name);
              st.setString(3 , last_name);
              st.setInt(4, salary);
              int count = st.executeUpdate();
              Employee e = new Employee();
              e.worker_id = worker_id;
              e.first_name = first_name;
              e.last_name = last_name;
              e.salary = salary;
              System.out.println("Added " + count + " " + first_name + " " + last_name);
              return e;
        }

        public Employee updateEmployee(int worker_id , String first_name , String last_name) throws Exception {
              String query = "UPDATE worker SET first_name = ?, last_name = ? WHERE worker_id = ?";
              PreparedStatement st = con.prepareStatement(query);
              st.setString(1 , first_name);
              st.setString(2 , last_name);
              st.setInt(3, worker_id);
              int count = st.executeUpdate();
              Employee e = new Employee();
              e.worker_id = worker_id;
              e.first_name = first_name;
              e.last_name = last_name;
              return e;
        }
        public Employee remove(int worker_id) throws Exception {
            Employee e = getEmployee(worker_id);
            String query = "DELETE FROM worker WHERE worker_id = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, worker_id);
            int count = st.executeUpdate();
            e.worker_id = worker_id;
            return e;
        }

}
    class Employee{
        int worker_id;
        String first_name;
        String last_name;
        int salary;
    }
