package me.nicholasvaidyanathan.introductionToAlgorithms;

import org.junit.Assert;
import org.junit.Test;

public class RecursiveInsertionSortTest {
    @Test
    public void figure2_2() {
        final int[] numbers = new int[] { 5, 2, 4, 6, 1, 3};
        RecursiveInsertionSort.sort(numbers);
        final int[] expected = new int[] { 1, 2, 3, 4, 5, 6};
        Assert.assertArrayEquals(expected, numbers);
    }

    @Test
    public void exercise_2_1_1() {
        final int[] numbers = new int[] { 31, 41, 59, 26, 41, 58};
        RecursiveInsertionSort.sort(numbers);
        final int[] expected = new int[] { 26, 31, 41, 41, 58, 59};
        Assert.assertArrayEquals(expected, numbers);
    }
}
