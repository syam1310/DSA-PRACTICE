package org.p0425;

import org.p0425.Math.*;

public class Main {
    public static void main(String[] args) {
        Prime prime
                = new Prime();


        int n = 10;
        System.out.println(prime.countPrimes(n));
        System.out.println(Power.pow(2, Integer.MIN_VALUE));
        System.out.println(DistinctPrimeFactorsOfProductOfArray.distinctPrimeFactorsOfProductOfArray(new int[]{2, 4, 3, 7, 10, 6}));
        System.out.println(PascalsTriangle.pascalsTriangle(4));
        System.out.println(CatalonNumber.catalonNumber(4));
        System.out.println(CatalonNumber.recursiveCN(4));
        System.out.println(GenerateParentheses.generateParenthesis(3));
        System.out.println(MultiplyTwoStrings.multiplyTwoStrings("2", "10"));

        System.out.println(CountDigit.countDigit(10));
    }
}