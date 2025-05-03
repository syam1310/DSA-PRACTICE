package org.p0425.BinarySearch;

public class SearchInRotatedArray {

    public static int searchInRotatedArray(int[] arr, int target) {

        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[l] == arr[mid]) return mid;
            else if (arr[l] <= arr[mid]) {
                if (arr[l] <= target && target < arr[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (arr[mid] < target && target <= arr[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
