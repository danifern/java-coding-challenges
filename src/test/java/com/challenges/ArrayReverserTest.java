package com.challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayReverserTest {

    private final ArrayReverser reverser = new ArrayReverser();

    @Test
    void testReverseOddNumberOfElements() {
        // Ejemplo: [1, 2, 3, 4, 5] -> [5, 4, 3, 2, 1]
        int[] original = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected, reverser.reverseArray(original));
    }

    @Test
    void testReverseEvenNumberOfElements() {
        int[] original = {10, 20, 30, 40};
        int[] expected = {40, 30, 20, 10};
        assertArrayEquals(expected, reverser.reverseArray(original));
    }

    @Test
    void testReverseEmptyArray() {
        int[] original = {};
        int[] expected = {};
        assertArrayEquals(expected, reverser.reverseArray(original));
    }

    @Test
    void testReverseSingleElementArray() {
        int[] original = {100};
        int[] expected = {100};
        assertArrayEquals(expected, reverser.reverseArray(original));
    }
}