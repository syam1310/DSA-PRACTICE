package org.p0425.Map;

import java.util.ArrayList;
import java.util.List;

public class MyMap {
    private List<List<Entry>> map;

    MyMap() {
        map = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            map.add(new ArrayList<>());
        }
    }

    private int hash(int key) {
        return key % 10;
    }

    public void put(int key, int val) {
        int hash = hash(key);
        List<Entry> bucket = map.get(hash);

        for (Entry entry : bucket) {
            if (entry.key == key) {
                entry.val = val;
            }
        }
        bucket.add(new Entry(key, val));

    }

    public int get(int key) {
        int hash = hash(key);

        List<Entry> bucket = map.get(hash);
        for (Entry entry : bucket) {
            if (entry.key == key) return entry.val;
        }
        return -1;
    }

    public void remove(int key){
        int hash = hash(key);
        List<Entry> entries = map.get(hash);
        for(int i=0; i<entries.size(); i++){
            Entry entry = entries.get(i);
            if(entry.key == key){
                entries.remove(i);
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "MyMap{" +
                "map=" + map +
                '}';
    }

    private static class Entry {
        private int key;
        private int val;

        Entry(int key, int val) {
            this.key = key;
            this.val = val;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", val=" + val +
                    '}';
        }
    }

}
