package org.p0425.Sort;

public class MergeSort {
    public static void mergeSort(int[] arr, int l, int h){
        if(l == h)return;
        int mid = l + (h - l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, h);
        merge(arr, l, mid, h);
    }
    private static void merge(int[] arr, int l, int mid, int r){
        int i = l, j = mid+1, k = 0;
        int[] temp = new  int[r - l + 1];

        while (i <= mid && j <= r){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid ){
            temp[k++] = arr[i++];

        }
        while (j <= r){
            temp[k++] = arr[j++];
        }

        for(i = l, k = 0; i<=r; i++, k++){
            arr[i] = temp[k];
        }
    }
}
