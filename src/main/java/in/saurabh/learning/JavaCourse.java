package in.saurabh.learning;
public class JavaCourse implements Course {
    @Override
    public boolean coursePurchase(){
        System.out.println("Java course purchase");
        return true;
    }
}