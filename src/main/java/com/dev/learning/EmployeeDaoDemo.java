//DAO-Operations - Fetch , Add , Manipulate , Delete
/*
->There will be a class in which all database-logic will be there.
->
 */
package com.dev.learning;

class EmployeeDaoDemo{
    public static void main(String[] args){
        EmployeeDao e = new EmployeeDaoDemo();
        e.connect(); //First make connection of this dao object with DB.
        Employee s1 = e.getEmployee(2);
        System.out.println(s1.first_name);

    }
}
