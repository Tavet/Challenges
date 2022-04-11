package com.github.tavet.challenges.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * https://www.hackerrank.com/challenges/find-the-running-median/problem
 */
public class FindRunningMedia {
    public List<Double> runningMedian(List<Integer> a) {
        if (a.isEmpty() || a.size() == 1) {
            return Collections.emptyList();
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        List<Double> answer = new ArrayList<>();
        int length = a.get(0);

        for (int i = 1; i < length + 1; i++) {
            int number = a.get(i);
            double operation;

            if(maxHeap.isEmpty()) {
                maxHeap.add(a.get(i));
            } else if(maxHeap.size() == minHeap.size()) {
                if(number < minHeap.peek()) {
                    maxHeap.add(number);
                } else {
                    minHeap.add(number);
                    maxHeap.add(minHeap.poll());
                }
            } else if (maxHeap.size() > minHeap.size()) {
                if(number > maxHeap.peek()) {
                    minHeap.add(number);
                } else {
                    maxHeap.add(number);
                    minHeap.add(maxHeap.poll());
                }
            }

            if(maxHeap.isEmpty()) {
                return Collections.singletonList(0.0);
            } else if(maxHeap.size() == minHeap.size()) {
                operation = (maxHeap.peek() + minHeap.peek()) / 2.0;
            } else {
                operation = maxHeap.peek();
            }

            answer.add(operation);
        }

        return answer;
    }
}
