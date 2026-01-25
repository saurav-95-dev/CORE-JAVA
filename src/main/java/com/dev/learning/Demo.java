//Encapsulation:
//Keys :
package com.dev.learning;
class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

}

class Demo{
    public static void main(String[] args) {
        System.out.println("Encapsulation:");
        Human h = new Human();
        h.setAge(18);
        h.setName("new name");
        System.out.println( h.getAge());
        System.out.println(h.getName());

    }
}