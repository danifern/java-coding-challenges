package com.challenges;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class Challenge18_TwoSumTest {

    private final Challenge18_TwoSum twoSumFinder = new Challenge18_TwoSum();

    private void assertArrayEqualsIgnoringOrder(int[] expected, int[] actual) {
        // Sort both arrays before comparing to make the test independent of the order of elements.
        Arrays.sort(expected);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testSimplePair() {
        int[] expected = {1, 3};
        int[] actual = twoSumFinder.findTwoSum(new int[]{1, 2, 3, 5}, 4);
        assertArrayEqualsIgnoringOrder(expected, actual);
    }

    @Test
    void testPairWithDuplicatesInArray() {
        int[] expected = {4, 3};
        int[] actual = twoSumFinder.findTwoSum(new int[]{7, 7, 4, 3, 8}, 7);
        assertArrayEqualsIgnoringOrder(expected, actual);
    }

    @Test
    void testLargerNumbers() {
        int[] expected = {13, 71};
        int[] actual = twoSumFinder.findTwoSum(new int[]{13, 43, 2, 71}, 84);
        assertArrayEqualsIgnoringOrder(expected, actual);
    }

    @Test
    void testWithNegativeNumbers() {
        int[] expected = {-2, 10};
        int[] actual = twoSumFinder.findTwoSum(new int[]{-2, 5, 8, 10}, 8);
        assertArrayEqualsIgnoringOrder(expected, actual);
    }
}