package org.p0425.Arrays;

import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] arr1, int[] arr2){
        for(int i = arr2.length-1; i>=0; i--){
            if(arr1[arr1.length-1] > arr2[i]){
                int last = arr1[arr1.length-1];
                int j = arr1.length-2;

                while (j >= 0 && arr1[j] > arr2[i]){
                    arr1[j+1] = arr1[j];
                    j--;
                }
                arr1[j+1] = arr2[i];
                arr2[i] = last;
            }
        }
    }
    public static void opMerge(int[] arr1, int[] arr2){
        int i = arr1.length-1;
        int j = 0;

        while (i >= 0 && j < arr2.length){
            if(arr1[i] < arr2[j])i--;
            else{
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--; j++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
