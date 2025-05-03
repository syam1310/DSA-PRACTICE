package org.p0425.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid + 1, r);
        }
    }

    public static void marge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            arr2[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k++] = arr1[i++];
        }
        while (j < n2) {
            arr[k++] = arr2[j++];
        }
    }

    private static void merge(int[] arr, int s, int mid, int e) {
        int[] temp = new int[e - s + 1];
        int l = s, r = mid, k = 0;
        // int invCount = 0;

        while (l < mid && r <= e) {
            if (arr[l] <= arr[r]) {
                temp[k++] = arr[l++];
            } else {
                temp[k] = arr[r];
                k++;
                r++;
            }
        }
        while (l < mid) {
            temp[k++] = arr[l++];
        }
        while (r <= e) {
            temp[k++] = arr[r++];
        }
        for (l = s, k = 0; l <= e; l++, k++) {
            arr[l] = temp[k];
        }
    }
}
