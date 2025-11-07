package com.meennu.javabook.chap4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMinExample {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(85, 90, 78, 88);

        int maxScore = Collections.max(scores);
        int minScore = Collections.min(scores);

        System.out.println("Highest Score: " + maxScore); // Output: 90
        System.out.println("Lowest Score: " + minScore);   // Output: 78
    }
}
