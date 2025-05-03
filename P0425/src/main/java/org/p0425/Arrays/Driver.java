package org.p0425.Arrays;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        System.out.println(InversionCount.invCount(new int[]{6, 3, 5 ,2, 7}));

        int[] arr= {6, 3, 5 ,2, 7};
        MergeSort.mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
