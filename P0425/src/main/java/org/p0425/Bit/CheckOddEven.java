package org.p0425.Bit;

public class CheckOddEven {
    public static boolean checkEven(int n) {
        return (n & 1) == 0;
    }

    public static boolean checkOdd(int n) {
        return (n & 1) == 1;
    }
}
