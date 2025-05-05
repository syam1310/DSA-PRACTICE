package org.p0425.Sort;

import java.util.Arrays;

public class CountingSort {
    public static int[] countingSort(int[] arr) {
        if (arr.length == 0) return null;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int a : arr) {
            max = Math.max(max, a);
            min = Math.min(min, a);
        }

        int range = max - min + 1;
        int[] freq = new int[range];

        for (int a : arr) {
            freq[a - min]++;
        }

        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];
        }

        int[] sortedArr = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            int value = arr[i];
            int index = freq[value - min] - 1;
            sortedArr[index] = value;
            freq[value - min]--;
        }

        return sortedArr;
    }
}
