package me.nicholasvaidyanathan.introductionToAlgorithms;

public class MergeSort {
    public static void sort(final int[] numbers) {
        mergeSort(numbers, 0, numbers.length - 1);
    }

    private static void mergeSort(final int[] array, final int startIndex, final int endIndex) {
        if (startIndex < endIndex) {
            final int midpoint  = (startIndex + endIndex) / 2;
            mergeSort(array, startIndex, midpoint);
            mergeSort(array, midpoint+1, endIndex);
            mergeWithoutSentinels(array, startIndex, midpoint, endIndex);
        }
    }

    private static void merge(int[] array, int p, int q, int r) {
        if (p > q || p > r || q > r) {
            throw new IllegalStateException("p <= q < r");
        }
        final int n1 = q - p + 1;
        final int n2 = r - q;
        final int[] left = new int[n1+1];
        final int[] right = new int[n2+1];
        for (int i = 0; i < n1; i++) {
            left[i] = array[p+ i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = array[q+j+1];
        }
        left[n1] = Integer.MAX_VALUE;
        right[n2] = Integer.MAX_VALUE;
        int i = 0 ,j = 0;
        for (int k = p; k <= r; k++) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i = i + 1;
            } else {
                array[k] = right[j];
                j = j + 1;
            }
        }
    }

    private static void mergeWithoutSentinels(int[] array, int p, int q, int r) {
        if (p > q || p > r || q > r) {
            throw new IllegalStateException("p <= q < r");
        }
        final int n1 = q - p + 1;
        final int n2 = r - q;
        final int[] left = new int[n1];
        final int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = array[p+ i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = array[q+j+1];
        }
        int i = 0 ,j = 0, l = p;
        while (i < n1 && j < n2){
            if (left[i] <= right[j]) {
                array[l] = left[i];
                i = i + 1;
            } else {
                array[l] = right[j];
                j = j + 1;
            }
            l = l + 1;
        }
        while (i < n1) {
            array[l] = left[i];
            i = i + 1;
            l = l + 1;
        }

        while (j < n2) {
            array[l] = right[j];
            j = j + 1;
            l = l + 1;
        }
    }
}
