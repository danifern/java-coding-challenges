package com.challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Challenge01StringReverserTest {

    private final Challenge01_StringReverser reverser = new Challenge01_StringReverser();

    @Test
    void testReverseSimpleWord() {
        // Ejemplo: "apple" -> "elppa"
        assertEquals("elppa", reverser.reverseString("apple"));
    }

    @Test
    void testReverseCapitalizedWord() {
        // Ejemplo: "John" -> "nhoJ"
        assertEquals("nhoJ", reverser.reverseString("John"));
    }

    @Test
    void testReverseStringOfNumbers() {
        // Ejemplo: "1234567" -> "7654321"
        assertEquals("7654321", reverser.reverseString("1234567"));
    }

    @Test
    void testReverseEmptyString() {
        // Un string vacío invertido debe seguir siendo un string vacío.
        assertEquals("", reverser.reverseString(""));
    }

    @Test
    void testReverseStringWithSpaces() {
        // Prueba con espacios para asegurar que se manejan correctamente.
        assertEquals("edc ba", reverser.reverseString("ab cde"));
    }
}