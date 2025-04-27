package org.p0425.Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParentheses {

    /*Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.



    Example 1:

    Input: n = 3
    Output: ["((()))","(()())","(())()","()(())","()()()"]*/

    public static List<String> generateParenthesis(int n) {
        List<List<String>> dp = new ArrayList<>();
        dp.add(Arrays.asList(""));
        dp.add((Arrays.asList("()")));

        for (int i = 2; i <= n; i++) {
            List<String> current = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                for (String s1 : dp.get(j)) {
                    for (String s2 : dp.get(i - j - 1)) {
                        current.add("(" + s1 + ")" + s2);
                    }
                }
            }
            dp.add(current);
        }
        return dp.get(n);
    }
}
