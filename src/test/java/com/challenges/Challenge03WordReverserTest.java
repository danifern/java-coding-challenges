package com.challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Challenge03WordReverserTest {

    private final Challenge03_WordReverser wordReverser = new Challenge03_WordReverser();

    @Test
    void testReverseMultipleWords() {
        // Ejemplo: "apple banana kiwi" -> "kiwi banana apple"
        assertEquals("kiwi banana apple", wordReverser.reverseWords("apple banana kiwi"));
    }

    @Test
    void testReverseSentence() {
        // Ejemplo: "I am John Doe" -> "Doe John am I"
        assertEquals("Doe John am I", wordReverser.reverseWords("I am John Doe"));
    }

    @Test
    void testSingleWord() {
        // Ejemplo: "orange" -> "orange"
        assertEquals("orange", wordReverser.reverseWords("orange"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", wordReverser.reverseWords(""));
    }

    @Test
    void testStringWithExtraSpaces() {
        // El método debería manejar espacios extra entre palabras.
        assertEquals("world hello", wordReverser.reverseWords("  hello   world  "));
    }
}