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

            if (q.get(i) <= currentPosition) {
                if (i < q.size() - 1) {
                    if (q.get(i) < q.get(i + 1))
                        continue;
                } else {
                    continue;
                }
            }

            int bribesSize = q.get(i) - currentPosition;
            bribesSize = bribesSize < 0 ? bribesSize * -1 : bribesSize; // Convert to positive if it's negative
            if (bribesSize <= 2) {
                bribes += bribesSize;
            } else {
                bribes = 0;
                break;
            }
        }

        return bribes == 0 ? "Too chaotic" : String.valueOf(bribes);
    }
}
