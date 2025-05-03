package org.p0425.BinarySearch;

public class Driver {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(SearchInRotatedArray.searchInRotatedArray(arr, target));
    }
}
