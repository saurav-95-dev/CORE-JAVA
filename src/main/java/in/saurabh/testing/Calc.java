class Calc {

    // === Methods to test ===
    int add(int a, int b) {
        return a + b;
    }

    int divide(int a, int b) {
        return a / b;   // will throw exception if b = 0
    }

    // === A tiny custom assert method (simulating JUnit) ===
    static void assertEquals(int expected, int actual, String testName) {
        if (expected == actual) {
            System.out.println("✔ PASS : " + testName);
        } else {
            System.out.println("✘ FAIL : " + testName +
                    " | Expected: " + expected + ", Actual: " + actual);
        }
    }

    // === A tiny custom assert method for exceptions ===
    static void assertThrows(Runnable code, String testName) {
        try {
            code.run();  // run the code
            System.out.println("✘ FAIL : " + testName + " | Expected exception but none thrown");
        } catch (Exception e) {
            System.out.println("✔ PASS : " + testName + " | Exception thrown = " + e.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {

        Calc c = new Calc();

        System.out.println("\n===== RUNNING TEST CASES (Simulating JUnit 5) =====\n");

        // -------- Test 1: add() should return correct sum ----------
        int result1 = c.add(10, 20);
        assertEquals(30, result1, "add(10,20) should return 30");

        // -------- Test 2: add() incorrect intentionally ----------
        int result2 = c.add(5, 5);
        assertEquals(12, result2, "add(5,5) should return 12 (intentional fail)");

        // -------- Test 3: divide() ----------
        int result3 = c.divide(10, 2);
        assertEquals(5, result3, "divide(10,2) should return 5");

        // -------- Test 4: divide by zero should throw exception ----------
        assertThrows(() -> c.divide(10, 0), "divide(10,0) should throw ArithmeticException");

        System.out.println("\n===== TEST EXECUTION FINISHED =====");

    }
}
