package com.github.tavet.challenges.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SpiralMatrixTest {
    SpiralMatrix spiralMatrix;

    @BeforeEach
    void setUp() {
        spiralMatrix = new SpiralMatrix();
    }

    @Test
    void testCase1() {
        final int[][] test = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        final List<Integer> expected = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);

        assertEquals(expected, spiralMatrix.spiralOrder(test));
    }

    @Test
    void testCase2() {
        final int[][] test = {
                { 1, 2, 3 },
                { 4, 5, 6, },
                { 7, 8, 9, }
        };

        final List<Integer> expected = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);

        assertEquals(expected, spiralMatrix.spiralOrder(test));
    }
}
