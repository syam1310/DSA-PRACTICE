package org.p0425.Sort;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int[] arr = {3,-1, 9, 8, 4};
        //QuickSort.quickSort(arr, 0, arr.length - 1);
        //System.out.println(Arrays.toString(arr));
        //System.out.println(QuickSelect.quickSelect(arr, 0, arr.length-1, 2));
        //MergeSort.mergeSort(arr, 0, arr.length-1);
        InsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(CountingSort.countingSort(arr)));

    }
}
