package com.challenges;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class Challenge19_CustomSortTest {

    private final Challenge19_CustomSort sorter = new Challenge19_CustomSort();

    // --- Helper for creating a copy to sort ---
    private int[] getUnsortedArray() {
        return new int[]{6, 5, 2, 1, 9, 10, 0};
    }

    private int[] getReversedArray() {
        return new int[]{10, 9, 8, 7, 6};
    }

    // --- Tests for bubbleSort ---
    @Test
    void testBubbleSort() {
        int[] array = getUnsortedArray();
        sorter.bubbleSort(array);
        int[] expected = {0, 1, 2, 5, 6, 9, 10};
        assertArrayEquals(expected, array);
    }

    @Test
    void testBubbleSortOnReversedArray() {
        int[] array = getReversedArray();
        sorter.bubbleSort(array);
        int[] expected = {6, 7, 8, 9, 10};
        assertArrayEquals(expected, array);
    }

    // --- Tests for selectionSort ---
    @Test
    void testSelectionSort() {
        int[] array = getUnsortedArray();
        sorter.selectionSort(array);
        int[] expected = {0, 1, 2, 5, 6, 9, 10};
        assertArrayEquals(expected, array);
    }

    @Test
    void testSelectionSortOnReversedArray() {
        int[] array = getReversedArray();
        sorter.selectionSort(array);
        int[] expected = {6, 7, 8, 9, 10};
        assertArrayEquals(expected, array);
    }
}