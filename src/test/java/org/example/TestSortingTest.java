package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSortingTest {


    @Test
    public void testInsertionSort() {
        int[] input = {5, 3, 8, 1, 2, 7, 4, 6, 9, 0};
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        InsertionSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSort() {
        int[] input = {5, 3, 8, 1, 2, 7, 4, 6, 9, 0};
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        MergeSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSort() {
        int[] input = {5, 3, 8, 1, 2, 7, 4, 6, 9, 0};
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        QuickSort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testRadixSort() {
        int[] input = {5, 3, 8, 1, 2, 7, 4, 6, 9, 0};
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        RadixSort.sort(input);
        assertArrayEquals(expected, input);
    }

}