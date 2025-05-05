package org.p0425.Sort;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i = 1; i<arr.length; i++){
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
