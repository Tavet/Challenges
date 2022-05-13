package com.github.tavet.challenges.hackerrank;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/new-year-chaos
 */
public class NewYearChaos {
    public String minimumBribes(List<Integer> q) {
        int size = q.size() + 1;
        int bribes = 0;
        for (int i = 0; i < size - 1; i++) {
            int currentPosition = i + 1;
            if(q.get(i) == currentPosition) {
                continue;
            }
            int bribesSize = q.get(i) - currentPosition;
            if(bribesSize <= 2) {
                bribes += bribesSize;
            } else {
                bribes = 0;
                break;
            }
        }

        return bribes == 0 ? "Too chaotic" : String.valueOf(bribes);
    }
}
