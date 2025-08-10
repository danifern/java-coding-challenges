package com.challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Challenge17_EvenOrOddTest {

    private final Challenge17_EvenOrOdd checker = new Challenge17_EvenOrOdd();

    @Test
    void testOddNumber() {
        assertEquals("Odd", checker.isEvenOrOdd(5));
        assertEquals("Odd", checker.isEvenOrOdd(101));
    }

    @Test
    void testEvenNumber() {
        assertEquals("Even", checker.isEvenOrOdd(2));
        assertEquals("Even", checker.isEvenOrOdd(100));
    }

    @Test
    void testZero() {
        // Zero is considered an even number.
        assertEquals("Even", checker.isEvenOrOdd(0));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals("Odd", checker.isEvenOrOdd(-5));
        assertEquals("Even", checker.isEvenOrOdd(-2));
    }
}