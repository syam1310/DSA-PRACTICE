package org.p0425.Arrays;

public class InversionCount {
    public static int invCount(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static int mergeSort(int[] arr, int s, int e) {
        int invCount = 0;
        if (s < e) {
            int mid = s + (e - s) / 2;

            invCount += mergeSort(arr, s, mid);
            invCount += mergeSort(arr, mid + 1, e);

            invCount += merge(arr, s, mid + 1, e);
        }
        return invCount;
    }

    private static int merge(int[] arr, int s, int mid, int e) {
        int[] temp = new int[e - s + 1];
        int l = s, r = mid, k = 0;
        int invCount = 0;

        while (l < mid && r <= e) {
            if (arr[l] <= arr[r]) {
                temp[k++] = arr[l++];
            } else {
                temp[k] = arr[r];
                invCount += (mid - l);
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
        return invCount;
    }
}
