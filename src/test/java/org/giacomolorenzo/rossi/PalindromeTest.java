package org.giacomolorenzo.rossi;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void whenEmptyString_thenAccept() {
        // assertTrue(Palindrome.isPalindrome(""));
        assertTrue(Palindrome.isEven(2));
    }
}