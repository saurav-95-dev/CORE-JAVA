package in.saurabh.learning;

public class SpringbootCourse implements Course {
    @Override
    public boolean coursePurchase() {
        System.out.println("Springboot course purchase");
        return true;
    }
}