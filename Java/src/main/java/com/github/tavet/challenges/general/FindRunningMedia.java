package com.github.tavet.challenges.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/find-the-running-median/problem
 */
public class FindRunningMedia {
    public List<Double> runningMedian(List<Integer> a) {
        if (a.isEmpty() || a.size() == 1) {
            return Collections.emptyList();
        }
        List<Double> answer = new ArrayList<>();
        List<Integer> operations = new ArrayList<>();
        int length = a.get(0);

        for (int i = 1; i < length + 1; i++) {
            operations.add(a.get(i));
            Collections.sort(operations);

            double operation = 0;
            if (operations.size() % 2 == 0) {
                operation = ((double) operations.get(operations.size() / 2) +
                        (double) operations.get((operations.size() / 2) - 1))
                        / 2;
            } else {
                operation = (double) operations.get(operations.size() / 2);
            }
            answer.add(operation);
        }

        return answer;
    }
}
