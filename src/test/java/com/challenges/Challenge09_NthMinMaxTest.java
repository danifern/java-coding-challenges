package com.challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Challenge09_NthMinMaxTest {

    private final Challenge09_NthMinMax finder = new Challenge09_NthMinMax();

    // --- Tests for findSecondMax ---
    @Test
    void testFindSecondMax() {
        assertEquals(103, finder.findSecondMax(new int[]{4, 781, 8, 99, 103}));
        assertEquals(4, finder.findSecondMax(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testFindSecondMaxWithDuplicates() {
        assertEquals(9, finder.findSecondMax(new int[]{10, 9, 8, 10, 9, 8}));
    }

    // --- Tests for findSecondMin ---
    @Test
    void testFindSecondMin() {
        assertEquals(8, finder.findSecondMin(new int[]{4, 781, 8, 99, 103}));
        assertEquals(2, finder.findSecondMin(new int[]{1, 3, 2, 4, 5}));
    }

    @Test
    void testFindSecondMinWithDuplicates() {
        assertEquals(2, finder.findSecondMin(new int[]{1, 1, 2, 3, 2, 3}));
    }

    // --- Tests for findNthMax ---
    @Test
    void testFindNthMax() {
        int[] arr = {4, 3, 2, 8, 9, 5};
        assertEquals(9, finder.findNthMax(arr, 1)); // 1st max
        assertEquals(8, finder.findNthMax(arr, 2)); // 2nd max
        assertEquals(5, finder.findNthMax(arr, 3)); // 3rd max
    }

    @Test
    void testFindNthMaxWithInvalidN() {
        // If n is out of bounds, it should throw an exception.
        assertThrows(IllegalArgumentException.class, () -> {
            finder.findNthMax(new int[]{1, 2, 3}, 100);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            finder.findNthMax(new int[]{1, 2, 3}, 0);
        });
    }
}