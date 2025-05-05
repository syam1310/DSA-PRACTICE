package org.p0425.Math;

public class CountDigit {
    public static double countDigit(int n) {
        double log = (int) Math.log10(n);
        System.out.println(log);
        return  Math.floor(log + 1);
    }
}
