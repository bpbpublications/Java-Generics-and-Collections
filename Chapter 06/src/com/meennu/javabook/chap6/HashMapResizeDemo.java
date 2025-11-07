package com.meennu.javabook.chap6;

import java.util.HashMap;

public class HashMapResizeDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(4, 0.75f); // small initial capacity to trigger resize

        for (int i = 1; i <= 10; i++) {
            map.put(i, "Value " + i);
            System.out.println("Added: " + i + " => map size: " + map.size());
        }

    }
}
