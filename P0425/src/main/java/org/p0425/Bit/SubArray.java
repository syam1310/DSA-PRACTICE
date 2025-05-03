package org.p0425.Bit;

import java.util.ArrayList;
import java.util.List;

public class SubArray {
    public static List<List<Integer>> subArray(int[] arr) {
        List<List<Integer>> allSubArray = new ArrayList<>();

        for (int i = 0; i < (int) Math.pow(2, arr.length); i++) {
            List<Integer> set = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                if ((i & (1 << j)) == 0) {
                    set.add(arr[j]);
                }
            }
            allSubArray.add(set);
        }
        return allSubArray;

    }

    public static List<List<String>> subSet(String s) {
        char[] ch = s.toCharArray();
        List<List<String>> allSubSets = new ArrayList<>();

        for (int i = 0; i < (1 << ch.length); i++) {
            List<String> set = new ArrayList<>();
            for (int j = 0; j < ch.length; j++) {
                if ((i & (1 << j)) == 0) set.add(ch[j] + "");
            }
            allSubSets.add(set);
        }
        return allSubSets;
    }
}
