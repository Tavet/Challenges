package com.github.tavet.patterns.mergeintervals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeIntervalsTest {
    MergeIntervals mergeIntervals;

    @BeforeEach
    void setUp() {
        mergeIntervals = new MergeIntervals();
    }

    @Test
    void testCase1() {
        int[][] input = new int[][]{{1, 6}, {2, 4}};
        int[][] expected = new int[][]{{1, 6}};
        assertArrayEquals(expected, mergeIntervals.merge(input));
    }

    @Test
    void testCase2() {
        int[][] input = new int[][]{{1, 8}};
        int[][] expected = new int[][]{{1, 8}};
        assertArrayEquals(expected, mergeIntervals.merge(input));
    }

    @Test
    void testCase3() {
        int[][] input = new int[][]{{2, 9}, {3, 5}, {4, 8}};
        int[][] expected = new int[][]{{2, 9}};
        assertArrayEquals(expected, mergeIntervals.merge(input));
    }

    @Test
    void testCase4() {
        int[][] input = new int[][]{{2, 4}, {3, 5}, {4, 5}, {6, 10}, {12, 14}};
        int[][] expected = new int[][]{{2, 5}, {6, 10}, {12, 14}};
        assertArrayEquals(expected, mergeIntervals.merge(input));
    }
}
