package org.p0425.Bit;

public class CountSetBit {
    public static int countSetBit(int n){
        int count = 0;
        for(int i=0; i<32; i++){
            if((n & (1 << i)) != 0)count++;
        }
        return count;
    }
    public static int cntSetBit(int n){
        int count = 0;

        while (n != 0){
            n = (n & (n-1));
            count++;
        }
        return count;
    }
}
