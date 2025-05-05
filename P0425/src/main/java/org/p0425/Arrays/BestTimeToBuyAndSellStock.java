package org.p0425.Arrays;

import org.p0425.Main;

public class BestTimeToBuyAndSellStock {
    public static int bestTimeToBuyAndSellStock(int[] prices){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int price : prices){
            min = Math.min(min, price);
            int profit = price - min;
            max = Math.max(max, profit);
        }
        return max;
    }
}
