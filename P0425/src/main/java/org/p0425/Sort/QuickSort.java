package org.p0425.Sort;

public class QuickSort {
    public static void quickSort(int[] arr, int l ,int h){
        if(l < h){
            int partition = partition(arr, l, h);
            quickSort(arr, l, partition - 1);
            quickSort(arr, partition + 1, h);
        }
    }
    public static int partition(int[] arr, int l, int h){
        int pivote = h;
        int i = l;
        int j = h;

        while (i < j){
            if(arr[i] > arr[pivote]){
                j--;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }else{
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[pivote];
        arr[pivote] = temp;
        return i;
    }
}
