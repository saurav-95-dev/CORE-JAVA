//service class for invoking selected courses:

package com.saurabh.learning;

import com.dev.learning.Course;

public class PurchaseCourse{
    private Course course;
    public boolean purchaseCourse(Course course){  //created reference of interface
        return course.selectCourse();
    }
}