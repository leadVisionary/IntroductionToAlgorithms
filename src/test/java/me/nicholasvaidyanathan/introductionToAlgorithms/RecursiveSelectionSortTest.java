package me.nicholasvaidyanathan.introductionToAlgorithms;

import org.junit.Assert;
import org.junit.Test;

public class RecursiveSelectionSortTest {
    @Test
    public void exercise_2_1_1() {
        final int[] numbers = new int[] { 31, 41, 59, 26, 41, 58};
        RecursiveSelectionSort.sort(numbers);
        final int[] expected = new int[] { 26, 31, 41, 41, 58, 59};
        Assert.assertArrayEquals(expected, numbers);
    }
}
