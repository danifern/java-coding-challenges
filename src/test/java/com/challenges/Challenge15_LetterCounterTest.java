package com.challenges;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class Challenge15_LetterCounterTest {

    private final Challenge15_LetterCounter counter = new Challenge15_LetterCounter();

    @Test
    void testCountLettersInHello() {
        Map<Character, Integer> expected = Map.of('h', 1, 'e', 1, 'l', 2, 'o', 1);
        Map<Character, Integer> actual = counter.countLetters("hello");
        assertEquals(expected, actual);
    }

    @Test
    void testCountLettersInAaaaaa() {
        Map<Character, Integer> expected = Map.of('a', 6);
        Map<Character, Integer> actual = counter.countLetters("aaaaaa");
        assertEquals(expected, actual);
    }

    @Test
    void testCountLettersInAbca() {
        Map<Character, Integer> expected = Map.of('a', 2, 'b', 1, 'c', 1);
        Map<Character, Integer> actual = counter.countLetters("abca");
        assertEquals(expected, actual);
    }

    @Test
    void testCountLettersInEmptyString() {
        assertTrue(counter.countLetters("").isEmpty());
    }

    @Test
    void testCountLettersWithMixedCase() {
        Map<Character, Integer> expected = Map.of('H', 1, 'e', 1, 'l', 2, 'o', 1);
        Map<Character, Integer> actual = counter.countLetters("Hello");
        assertEquals(expected, actual, "The count should be case-sensitive.");
    }
}