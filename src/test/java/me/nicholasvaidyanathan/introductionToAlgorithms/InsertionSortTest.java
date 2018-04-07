package me.nicholasvaidyanathan.introductionToAlgorithms;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {
    @Test
    public void figure2_2() {
        final int[] numbers = new int[] { 5, 2, 4, 6, 1, 3};
        InsertionSort.sort(numbers);
        final int[] expected = new int[] { 1, 2, 3, 4, 5, 6};
        Assert.assertArrayEquals(expected, numbers);
    }

    @Test
    public void exercise_2_1_1() {
        final int[] numbers = new int[] { 31, 41, 59, 26, 41, 58};
        InsertionSort.sort(numbers);
        final int[] expected = new int[] { 26, 31, 41, 41, 58, 59};
        Assert.assertArrayEquals(expected, numbers);
    }

    @Test
    public void exercise_2_1_2() {
        final int[] numbers = new int[] { 5, 2, 4, 6, 1, 3};
        InsertionSortDecreasingOrder.sort(numbers);
        final int[] expected = new int[] { 6, 5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, numbers);
    }
}
