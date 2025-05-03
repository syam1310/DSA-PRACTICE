package org.p0425.Bit;

public class CheckPowOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return ((n & (n - 1)) == 0);
    }

    public static boolean checkPowerOfTwo(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) {
            n >>= 2;
        }
        return n == 1;
    }
}
