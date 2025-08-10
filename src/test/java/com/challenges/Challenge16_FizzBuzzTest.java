package com.challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Challenge16_FizzBuzzTest {

    private final Challenge16_FizzBuzz fizzBuzzGenerator = new Challenge16_FizzBuzz();

    @Test
    void testDivisibleByThree() {
        assertEquals("Fizz", fizzBuzzGenerator.fizzBuzz(3));
        assertEquals("Fizz", fizzBuzzGenerator.fizzBuzz(9));
    }

    @Test
    void testDivisibleByFive() {
        assertEquals("Buzz", fizzBuzzGenerator.fizzBuzz(5));
        assertEquals("Buzz", fizzBuzzGenerator.fizzBuzz(10));
    }

    @Test
    void testDivisibleByThreeAndFive() {
        assertEquals("FizzBuzz", fizzBuzzGenerator.fizzBuzz(15));
        assertEquals("FizzBuzz", fizzBuzzGenerator.fizzBuzz(30));
    }

    @Test
    void testNotDivisibleByThreeOrFive() {
        assertEquals("4", fizzBuzzGenerator.fizzBuzz(4));
        assertEquals("7", fizzBuzzGenerator.fizzBuzz(7));
    }

    @Test
    void testWithZero() {
        // Zero is divisible by both 3 and 5.
        assertEquals("FizzBuzz", fizzBuzzGenerator.fizzBuzz(0));
    }
}