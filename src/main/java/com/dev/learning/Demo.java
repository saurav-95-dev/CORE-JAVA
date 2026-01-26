//Concept of "this" keyword :
package com.dev.learning;

class Student{
    public String name;
    public int marks;

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public int getMarks() {
        return marks;
    }
    public void setName(String name) {
        this.name = name; //this is a pointer to the student object .
        //value of local variable name is assigned to instance variable i.e name using this keyword.
        //In-short , we are accessing the instance variable via this keyword which points to the current object.
    }
}
class Demo{
    public static void main(String[] args){
        System.out.println("this keyword:");
        Student student = new Student();
        student.setMarks(12);
        student.setName("Saurabh");
    }
}