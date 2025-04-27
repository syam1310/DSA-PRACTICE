package org.p0425.Math;

public class Power {
    public static double pow(double a, double b) {
        double res = 1;

        if(b == Integer.MIN_VALUE){
            a *= a;
            b /= 2;
        }

        if(b < 0){
            a = 1/a;
            b = -b;
        }
        while (b > 0) {
            if (b % 2 == 1) res *= a;

            a *= a;
            b /= 2;
        }
        return res;
    }
}
