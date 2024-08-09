package com.github.tavet.challenges.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagicSquaresTest {
    MagicSquares magicSquares;

    @BeforeEach
    void setUp() {
        magicSquares = new MagicSquares();
    }

    @Test
    void testCase1() {
        final int[][] test = {{4,3,8,4}, {9,5,1,9}, {2,7,6,2}};

        final int expected = 1;

        assertEquals(expected, magicSquares.numMagicSquaresInside(test));
    }

    @Test
    void testCase2() {
        final int[][] test = {{2, 7, 6}, {1, 5, 9}, {4, 3, 8}};

        final int expected = 0;

        assertEquals(expected, magicSquares.numMagicSquaresInside(test));
    }

    @Test
    void testCase3() {
        final int[][] test = {{5, 5, 5}, {5, 5, 5}, {5, 5, 5}};

        final int expected = 0;

        assertEquals(expected, magicSquares.numMagicSquaresInside(test));
    }

    @Test
    void testCase4() {
        final int[][] test = {{7, 0, 5}, {2, 4, 6}, {3, 8, 1}};

        final int expected = 0;

        assertEquals(expected, magicSquares.numMagicSquaresInside(test));
    }
}
