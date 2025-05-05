package org.p0425.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllDuplicatesInAnArray {
    public static List<Integer> dup(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > 1) list.add(num);
        }
        return list;
    }

    public static List<Integer> dup2(int[] arr) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int num = Math.abs(arr[i]);
            int idx = num - 1;

            if (arr[idx] < 0) {
                res.add(num);
            }
            arr[idx] *= -1;
        }
        return res;
    }
}
