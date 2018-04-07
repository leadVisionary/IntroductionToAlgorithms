package me.nicholasvaidyanathan.introductionToAlgorithms;

public class RecursiveSelectionSort {
    public static void sort(int[] numbers) {
        select(numbers, 0, numbers.length - 1);
    }

    private static void select(final int[] numbers, final int startIndex, final int endIndex) {
        int min = numbers[startIndex];
        for (int i = startIndex; i <= endIndex; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                numbers[i] = numbers[startIndex];
                numbers[startIndex] = min;
            }
        }
        if (startIndex < endIndex) {
            select(numbers, startIndex + 1, endIndex);
        }
    }
}