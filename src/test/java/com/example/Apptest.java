package src.test.java.com.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class AppTest {
    @Test
    public void testIsPrime() {
        assertTrue(App.isPrime(5));
        assertTrue(App.isPrime(13));
        assertFalse(App.isPrime(4));
        assertFalse(App.isPrime(1));
    }
}
