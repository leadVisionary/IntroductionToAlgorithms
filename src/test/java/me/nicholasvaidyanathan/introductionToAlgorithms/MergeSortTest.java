package me.nicholasvaidyanathan.introductionToAlgorithms;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {
    @Test
    public void figure_2_4() {
        final int[] numbers = new int[] { 5, 2, 4, 7, 1, 3, 2, 6};
        MergeSort.sort(numbers);
        final int[] expected = new int[] { 1, 2, 2, 3, 4, 5, 6, 7};
        Assert.assertArrayEquals(expected, numbers);
    }

    @Test
    public void figure_2_3() {
        final int[] numbers = new int[] { 2, 4, 5, 7, 1, 2, 3, 6};
        MergeSort.sort(numbers);
        final int[] expected = new int[] { 1, 2, 2, 3, 4, 5, 6, 7};
        Assert.assertArrayEquals(expected, numbers);
    }

    @Test
    public void figure_2_4_without_sentinels() {
        final int[] numbers = new int[] { 5, 2, 4, 7, 1, 3, 2, 6};
        MergeSortWithoutSentinels.sort(numbers);
        final int[] expected = new int[] { 1, 2, 2, 3, 4, 5, 6, 7};
        Assert.assertArrayEquals(expected, numbers);
    }

    @Test
    public void figure_2_3_without_sentinels() {
        final int[] numbers = new int[] { 2, 4, 5, 7, 1, 2, 3, 6};
        MergeSortWithoutSentinels.sort(numbers);
        final int[] expected = new int[] { 1, 2, 2, 3, 4, 5, 6, 7};
        Assert.assertArrayEquals(expected, numbers);
    }
}
