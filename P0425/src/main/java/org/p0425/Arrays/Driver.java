package org.p0425.Arrays;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        System.out.println(InversionCount.invCount(new int[]{6, 3, 5 ,2, 7}));

      //  int[] arr= {6, 3, 5 ,2, 7};
       // MergeSort.mergeSort(arr, 0, arr.length-1);
       // System.out.println(Arrays.toString(arr));

       // System.out.println(BestTimeToBuyAndSellStock.bestTimeToBuyAndSellStock(new int[] {7, 1, 5, 3, 6 ,4}));

//        int[]  arr1 = {2, 4, 7, 10};
//        int[] arr2 = {2, 3};
//        MergeSortedArray.opMerge(arr1, arr2);
//        System.out.println(Arrays.toString(arr1) +" ::" + Arrays.toString(arr2));


        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(FindAllDuplicatesInAnArray.dup(arr));
        System.out.println(FindAllDuplicatesInAnArray.dup2(arr));
    }
}
