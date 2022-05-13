package com.github.tavet.challenges.hackerrank;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/new-year-chaos
 */
public class NewYearChaos {
    public String minimumBribes(List<Integer> q) {

        int bribes = 0;

        for (int i = 0; i < q.size(); i++) {
            int currentPosition = i + 1;
            
            if (q.get(i) == currentPosition) {
                continue;
            }
            int bribesSize = q.get(i) - currentPosition;
            if (bribesSize <= 2) {
                bribes += bribesSize;
                i += bribesSize; // Skip loop the numbers that were swapped
            } else {
                bribes = 0;
                break;
            }
        }

        return bribes == 0 ? "Too chaotic" : String.valueOf(bribes);
    }
}
