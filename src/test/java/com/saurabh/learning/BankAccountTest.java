import com.saurabh.learning.BankAccount;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount account;

    @BeforeEach
    void setup() {
        account = new BankAccount(); // runs before every test
    }

    @AfterEach
    void cleanup() {
        // runs after every test (optional)
    }

    @Test
    void depositTest() {
        account.deposit(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    void multipleDepositTest() {
        account.deposit(200);
        account.deposit(300);
        assertEquals(500, account.getBalance());
    }
}
