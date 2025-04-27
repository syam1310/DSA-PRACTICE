package org.p0425.Math;

import java.util.Arrays;

public class Prime {

    //Sieve of Eratosthenes O(N log logN)
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, 2, n + 1, true);

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < prime.length - 1; i++) {
            if (prime[i]) cnt++;
        }
        return cnt;
    }


}
