//To run test via command-line without IDE -- Add maven-surefire-plugin in pom.xml and initiate mvn test inside terminal.
//To run a test for a specific method inside a specific class --> mvn test -Dtest=MyTestClass#myTestMethod
package in.saurabh.testing;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    Calc calc = new Calc();
    @org.junit.jupiter.api.Test
    void testReverse1() {

        assertEquals("ved" , calc.reverseString("dev") );
    }
    @org.junit.jupiter.api.Test
    void testReverse2() {

        assertEquals("eman yo" , calc.reverseString("My name") , ()->"Bro . ...you missed !" );
    }
}