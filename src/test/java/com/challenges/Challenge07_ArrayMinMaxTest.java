package com.challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Challenge07_ArrayMinMaxTest {

    private final Challenge07_ArrayMinMax finder = new Challenge07_ArrayMinMax();

    // --- Tests for findMax ---
    @Test
    void testFindMaxInMixedArray() {
        assertEquals(781, finder.findMax(new int[]{4, 781, 8, 99, 103}));
    }

    @Test
    void testFindMaxInSortedArray() {
        assertEquals(5, finder.findMax(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testFindMaxWithNegativeNumbers() {
        assertEquals(-2, finder.findMax(new int[]{-10, -5, -2, -15}));
    }

    @Test
    void testFindMaxInSingleElementArray() {
        assertEquals(100, finder.findMax(new int[]{100}));
    }

    // --- Tests for findMin ---
    @Test
    void testFindMinInMixedArray() {
        assertEquals(4, finder.findMin(new int[]{4, 781, 8, 99, 103}));
    }

    @Test
    void testFindMinInSortedArray() {
        assertEquals(1, finder.findMin(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testFindMinWithNegativeNumbers() {
        assertEquals(-15, finder.findMin(new int[]{-10, -5, -2, -15}));
    }

    @Test
    void testFindMinInSingleElementArray() {
        assertEquals(100, finder.findMin(new int[]{100}));
    }

    @Test
    void testFindMaxInEmptyArray() {
        // Finding max in an empty array should throw an exception.
        assertThrows(IllegalArgumentException.class, () -> {
            finder.findMax(new int[]{});
        });
    }

    @Test
    void testFindMinInEmptyArray() {
        // Finding min in an empty array should also throw an exception.
        assertThrows(IllegalArgumentException.class, () -> {
            finder.findMin(new int[]{});
        });
    }
}