package org.p0425.Sort;

public class QuickSelect {
    public static int quickSelect(int[] arr, int l, int h, int k){

            int partition = partition(arr, l , h, k);
            if(partition == k - 1)return arr[partition];
            else if (partition < k - 1) {
                return  quickSelect(arr, partition + 1, h, k);
            }else{
                return  quickSelect(arr, l, partition - 1, k);
            }

    }
    private static int partition(int[] arr, int l, int h, int k){
        int p = h, j = h, i = l;

        while (i < j){
            if(arr[i] > arr[p]){
                j--;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }else{
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[p];
        arr[p] = temp;
        return i;
    }
}
