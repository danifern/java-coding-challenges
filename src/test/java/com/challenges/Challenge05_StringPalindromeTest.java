package com.challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Challenge05_StringPalindromeTest {

    private final Challenge05_StringPalindrome palindromeChecker = new Challenge05_StringPalindrome();

    @Test
    void testSimplePalindrome() {
        // Ejemplo: "anna" -> true
        assertTrue(palindromeChecker.isPalindrome("anna"));
    }

    @Test
    void testAnotherSimplePalindrome() {
        // Ejemplo: "level" -> true
        assertTrue(palindromeChecker.isPalindrome("level"));
    }

    @Test
    void testNonPalindrome() {
        // Ejemplo: "apple" -> false
        assertFalse(palindromeChecker.isPalindrome("apple"));
    }

    @Test
    void testPalindromeWithMixedCase() {
        // La prueba debería idealmente ignorar mayúsculas/minúsculas.
        // Si no lo hace, esta prueba fallará y te indicará que debes mejorar tu lógica.
        assertTrue(palindromeChecker.isPalindrome("Level"));
    }

    @Test
    void testEmptyString() {
        // Un string vacío se considera un palíndromo.
        assertTrue(palindromeChecker.isPalindrome(""));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(palindromeChecker.isPalindrome("a"));
    }
}