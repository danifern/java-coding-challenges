package com.challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Challenge14_RemoveDuplicatesTest {

    private final Challenge14_RemoveDuplicates remover = new Challenge14_RemoveDuplicates();

    @Test
    void testRemoveDuplicatesSimple() {
        assertEquals("helo", remover.removeDuplicates("hello"));
        assertEquals("aple", remover.removeDuplicates("apple"));
    }

    @Test
    void testRemoveAllDuplicates() {
        assertEquals("a", remover.removeDuplicates("aaaaaa"));
    }

    @Test
    void testStringWithNoDuplicates() {
        assertEquals("abc", remover.removeDuplicates("abc"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", remover.removeDuplicates(""));
    }

    @Test
    void testStringWithMixedCase() {
        // This tests if the logic is case-sensitive. 'h' and 'H' are different.
        assertEquals("heloH", remover.removeDuplicates("helloHello"));
    }
}