package org.p0425.Math;

import java.math.BigInteger;

public class MultiplyTwoStrings {
    public static String multiplyTwoStrings(String s1, String s2){
        return (new BigInteger(s1).multiply(new BigInteger(s2))).toString();
    }
}
