package com.challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Challenge06_NumberPalindromeTest {

    private final Challenge06_NumberPalindrome palindromeChecker = new Challenge06_NumberPalindrome();

    @Test
    void testSimplePalindrome() {
        // Example: 545 -> true
        assertTrue(palindromeChecker.isNumberPalindrome(545));
    }

    @Test
    void testDoubleDigitPalindrome() {
        // Example: 33 -> true
        assertTrue(palindromeChecker.isNumberPalindrome(33));
    }

    @Test
    void testNonPalindrome() {
        // Example: 13 -> false
        assertFalse(palindromeChecker.isNumberPalindrome(13));
    }

    @Test
    void testLargePalindrome() {
        assertTrue(palindromeChecker.isNumberPalindrome(12321));
    }

    @Test
    void testLargeNonPalindrome() {
        assertFalse(palindromeChecker.isNumberPalindrome(12345));
    }

    @Test
    void testSingleDigitIsPalindrome() {
        // Any single-digit number is a palindrome.
        assertTrue(palindromeChecker.isNumberPalindrome(7));
    }

    @Test
    void testZeroIsPalindrome() {
        assertTrue(palindromeChecker.isNumberPalindrome(0));
    }

    @Test
    void testNegativeNumber() {
        // By convention, negative numbers are not considered palindromes.
        assertFalse(palindromeChecker.isNumberPalindrome(-121));
    }
}