package org.p0425.Bit;

public class Driver {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        System.out.println(SubArray.subArray(new int[]{1,3,2,3,3}).size());
        System.out.println(CheckPowOfTwo.isPowerOfTwo(8));
        System.out.println(CheckPowOfTwo.checkPowerOfTwo(4));
        System.out.println(CountSetBit.countSetBit(0));
        System.out.println(CountSetBit.cntSetBit(14));
        System.out.println(CheckOddEven.checkEven(3));
        System.out.println(CheckOddEven.checkOdd(3));
    }
}
