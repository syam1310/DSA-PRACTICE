package org.p0425.Math;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> pascalsTriangle(int rowNums) {
        List<List<Integer>> pst = new ArrayList<>();

        for (int i = 0; i < rowNums; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    row.add(1);
                } else {
                    int ele = pst.get(i - 1).get(j - 1) + pst.get(i - 1).get(j);
                    row.add(ele);
                }
            }
            pst.add(row);
        }
        return pst;
    }
}
