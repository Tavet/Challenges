package com.github.tavet.patterns.mergeintervals;

import java.util.Collections;
import java.util.List;

/*
https://www.educative.io/courses/grokking-coding-interview-patterns-python/merge-intervals
We are given an array of closed intervals, where each interval has a start time and an end time.
The input array is sorted with respect to the start times of each interval.

Your task is to merge the overlapping intervals and return a new output array consisting of only the non-overlapping intervals.
 */
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return intervals;
        List<int[]> output = new java.util.ArrayList<>(Collections.singletonList(intervals[0]));

        for (int i = 1; i < intervals.length; i++) {
            int[] last = output.get(output.size() - 1);
            if(last[1] < intervals[i][0]) {
                output.add(intervals[i]);
            } else {
                int[] newInterval = new int[]{last[0], Math.max(intervals[i][1], last[1])};
                output.remove(output.size() - 1);
                output.add(newInterval);
            }
        }

        return output.toArray(new int[output.size()][]);
    }
}
