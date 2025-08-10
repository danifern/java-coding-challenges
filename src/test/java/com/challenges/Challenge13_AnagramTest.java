package com.challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Challenge13_AnagramTest {

    private final Challenge13_Anagram anagramChecker = new Challenge13_Anagram();

    @Test
    void testSimpleAnagrams() {
        assertTrue(anagramChecker.isAnagram("listen", "silent"));
        assertTrue(anagramChecker.isAnagram("triangle", "integral"));
        assertTrue(anagramChecker.isAnagram("abc", "bca"));
    }

    @Test
    void testNonAnagrams() {
        assertFalse(anagramChecker.isAnagram("abc", "ccb"));
        assertFalse(anagramChecker.isAnagram("hello", "world"));
    }

    @Test
    void testAnagramsWithDifferentLengths() {
        // Anagrams must have the same length.
        assertFalse(anagramChecker.isAnagram("aaa", "aaab"));
    }

    @Test
    void testAnagramsWithDifferentCases() {
        // The check should ideally be case-insensitive.
        assertTrue(anagramChecker.isAnagram("Listen", "Silent"));
    }

    @Test
    void testAnagramsWithSpaces() {
        // The check should ideally ignore spaces.
        assertTrue(anagramChecker.isAnagram("a gentleman", "elegant man"));
    }

    @Test
    void testEmptyStrings() {
        // Two empty strings are anagrams of each other.
        assertTrue(anagramChecker.isAnagram("", ""));
    }
}