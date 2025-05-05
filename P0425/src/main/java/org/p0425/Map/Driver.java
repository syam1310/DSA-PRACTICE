package org.p0425.Map;

public class Driver {
    public static void main(String[] args) {
        MyMap map = new MyMap();
        map.put(1, 2);
        map.put(1, 2);
        map.put(2, 1);
        map.put(21, 2);
        map.put(22, 2);
        System.out.println(map);
    }
}
