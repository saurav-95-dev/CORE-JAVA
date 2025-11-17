package in.saurabh.service;

import in.saurabh.learning.Course;

public class PurchaseCourse{
    //private var :
    private Course course;
    //method:
    public boolean proceedWithCourse(Course course){
        return course.coursePurchase();
    }
}