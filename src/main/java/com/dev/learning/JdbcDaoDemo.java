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
        Student s1 = getName(12);
        System.out.println("Name: " + s1.first_name);

    }
}

class StudentDao{

}