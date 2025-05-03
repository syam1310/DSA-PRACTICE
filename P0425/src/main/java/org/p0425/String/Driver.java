package org.p0425.String;

public class Driver {
    public static void main(String[] args) {
        String s = "hello test";
        System.out.println(ConvertCase.toLowerCase(ConvertCase.toUpperCase(s)));
    }
}
