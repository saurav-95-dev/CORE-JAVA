package com.dev.learning;

public class SpringbootCourse implements Course {
    public boolean selectCourse() {
        System.out.println("Springboot Course is purchased");
        return true;
    }
}