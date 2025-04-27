package org.p0425.Math;

import java.util.HashSet;
import java.util.Set;

public class DistinctPrimeFactorsOfProductOfArray {

   /* Given an array of positive integers nums, return the number of distinct prime factors in the product of the elements of nums.

    Note that:

    A number greater than 1 is called prime if it is divisible by only 1 and itself.
    An integer val1 is a factor of another integer val2 if val2 / val1 is an integer.
*/
    public static int distinctPrimeFactorsOfProductOfArray(int[] nums){
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            int i = 2;
            while(num > 1){
                if(num % i == 0){
                    set.add(i);
                    num /= i;
                }else{
                    i++;
                }
            }
        }
        return set.size();
    }
}


