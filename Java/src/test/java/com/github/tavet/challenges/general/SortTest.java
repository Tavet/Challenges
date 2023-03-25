package com.github.tavet.challenges.general;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortTest {

    Sort sort;
    @BeforeEach
    void setUp() {
        sort = new Sort();
    }

    @Test
    void bubbleSort_testCase1() {
        int[] input = {3, 9, 7, 1, 77, 3, 4, 2, 0};
        int[] expected = {0, 1, 2, 3, 3, 4, 7, 9, 77};
        assertEquals(Arrays.toString(expected), Arrays.toString(sort.bubbleSort(input)));
    }
}
