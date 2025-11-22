package in.saurabh.service;

import in.saurabh.learning.JavaCourse;
import in.saurabh.learning.SpringbootCourse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseCourseTest {

   @Test
    void testproceedWithCourse(){
       PurchaseCourse purchaseCourse = new PurchaseCourse();
       boolean status = purchaseCourse.proceedWithCourse(new SpringbootCourse());
       assertTrue(status);
   }
}