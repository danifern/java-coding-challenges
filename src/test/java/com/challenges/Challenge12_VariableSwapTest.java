package com.challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Challenge12_VariableSwapTest {

    private final Challenge12_VariableSwap swapper = new Challenge12_VariableSwap();

    @Test
    void testSwapWithPositiveNumbers() {
        // Example: {10, 15} -> {15, 10}
        int[] pair = {10, 15};
        swapper.swapWithoutTemp(pair);
        int[] expected = {15, 10};
        assertArrayEquals(expected, pair);
    }

    @Test
    void testSwapWithZero() {
        int[] pair = {0, 99};
        swapper.swapWithoutTemp(pair);
        int[] expected = {99, 0};
        assertArrayEquals(expected, pair);
    }

    @Test
    void testSwapWithNegativeNumber() {
        int[] pair = {-5, 25};
        swapper.swapWithoutTemp(pair);
        int[] expected = {25, -5};
        assertArrayEquals(expected, pair);
    }

    @Test
    void testSwapWithTwoSameNumbers() {
        int[] pair = {7, 7};
        swapper.swapWithoutTemp(pair);
        int[] expected = {7, 7};
        assertArrayEquals(expected, pair);
    }
}