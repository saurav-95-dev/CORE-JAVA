//DAO-Data-Access-Object-Basic Theory:
/*
->It is a design pattern that separates database logic from business logic.
->DAO is basically a class whose only job is to talk to the database.
*/
package com.dev.learning;

import java.sql.SQLOutput;

class JdbcDaoDemo {
    public static void main(String[] args) {
        System.out.println("DAO-Design Pattern");
        StudentDao studentDao = new StudentDao();
        Student s1 = studentDao.getStudent(2);
        System.out.println(s1.worker_id);
    }
}

class StudentDao{
    public Student getStudent(int worker_id) {
        Student s = new Student();
        s.worker_id = worker_id;
        return s;
    }
}

class Student{
    String first_name;
    int worker_id;
}