package org.giacomolorenzo.rossi;

import com.giacomolorenzo.rossi.Numeri;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Per provare la coverage on-the-fly e redigere il report, usa il comando
 * mvn -P coverageProfile clean package
 *
 * Se vuoi la coverage on-the-fly, ma non il report:
 * mvn -P coverageProfile clean test
 *
 * Per fare il testing senza coverage, usa il comando
 * mvn test
 */
public class NumeriTest {
    @Test
    public void isEvenTest() {
        // assertTrue(Palindrome.isPalindrome(""));
        assertTrue(Numeri.isPari(4));
        assertFalse(Numeri.isPari(3));
    }
}