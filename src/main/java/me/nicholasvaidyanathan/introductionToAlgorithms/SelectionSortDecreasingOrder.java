package me.nicholasvaidyanathan.introductionToAlgorithms;

public class SelectionSortDecreasingOrder {
    public static void sort(int[] numbers) {
        for (int i =0; i< numbers.length; i++) {
            int max = numbers[i];
            for (int j = i+1; j< numbers.length; j++) {
                if (numbers[j] > max) {
                    max = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = max;
                }
            }
        }
    }
}
