package me.nicholasvaidyanathan.introductionToAlgorithms;

public class RecursiveInsertionSort {
    public static void sort(final int[] numbers) {
        recursiveSort(numbers, 0, numbers.length -1);
    }

    private static void recursiveSort(int[] numbers, int startIndex, int endIndex) {
        if (endIndex > 1) {
            recursiveSort(numbers, startIndex, endIndex - 1);
        }
        insert(numbers, endIndex);
    }

    private static void insert(int[] numbers, int endIndex) {
        final int key = numbers[endIndex];
        int i = endIndex - 1;
        while (i >= 0 && numbers[i] > key) {
            numbers[i+1] = numbers[i];
            i = i - 1;
        }
        numbers[i + 1] = key;
    }
}
