package me.nicholasvaidyanathan.introductionToAlgorithms;

public class InsertionSort {
    public static void sort(final int[] numbers) {
        for (int j = 1; j < numbers.length; j++) {
            final int key = numbers[j];
            int i = j - 1;
            while (i >= 0 && numbers[i] > key) {
                numbers[i+1] = numbers[i];
                i = i -1;
            }
            numbers[i+1] = key;
        }
    }

    public static void decreasing(final int[] numbers) {
        for (int j = 1; j < numbers.length; j++) {
            final int key = numbers[j];
            int i = j - 1;
            while (i >= 0 && numbers[i] < key) {
                numbers[i+1] = numbers[i];
                i = i -1;
            }
            numbers[i+1] = key;
        }
    }
}
