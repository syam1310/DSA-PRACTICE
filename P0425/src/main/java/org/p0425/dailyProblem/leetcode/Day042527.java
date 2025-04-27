package org.p0425.dailyProblem.leetcode;

public class Day042527 {
    public static int countSubarraysOfLengthThreeWithACondition(int[] nums){
        int ans = 0;
        int i = 1;

        while (i < nums.length-1){
            if(nums[i] == (nums[i-1] + nums[i+1]) * 2)ans++;
            i++;
        }
        return ans;
    }
}
