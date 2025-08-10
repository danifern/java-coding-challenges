package com.challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Challenge04PrimeNumberCheckerTest {

    private final Challenge04_PrimeNumberChecker checker = new Challenge04_PrimeNumberChecker();

    @Test
    void testLargePrime() {
        // Example: 29 -> true
        assertTrue(checker.isPrime(29));
    }

    @Test
    void testNonPrime() {
        // Example: 35 -> false
        assertFalse(checker.isPrime(35));
    }

    @Test
    void testSmallPrime() {
        // Example: 7 -> true
        assertTrue(checker.isPrime(7));
    }

    @Test
    void testNumberTwo() {
        // 2 is the first prime number.
        assertTrue(checker.isPrime(2));
    }

    @Test
    void testNumberOneAndZero() {
        // 0 and 1 are not considered prime numbers.
        assertFalse(checker.isPrime(1));
        assertFalse(checker.isPrime(0));
    }

    @Test
    void testNegativeNumber() {
        // Negative numbers are not prime.
        assertFalse(checker.isPrime(-7));
    }
}