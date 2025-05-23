package org.p0425.Math;

public class CatalonNumber {
    public static int catalonNumber(int n){
        int[] dp = new int[n+1];
        dp[0] = dp[1] = 1;
        for(int i=2; i<=n; i++){
            for(int j=0; j<i; j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static int recursiveCN(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += recursiveCN(i) * recursiveCN(n - i - 1);
        }
        return res;
    }

}
