package org.p0425.String;

public class ConvertCase {
    public static String toUpperCase(String s) {
        String res = "";
        for (char c : s.toCharArray()) {
            int n = (int) c;
            if (c != ' ')
                n = (n & (~(1 << 5)));
            res += (char) n;
        }
        return res;
    }
    public static String toLowerCase(String s){
        String res = "";

        for(char c : s.toCharArray()){
            int n = (int)c;
            if(c != ' '){
                n = (n | (1 << 5));
            }
            res += (char)n;
        }
        return res;
    }
}
