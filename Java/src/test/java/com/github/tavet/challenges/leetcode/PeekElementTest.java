package com.github.tavet.challenges.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeekElementTest {

    PeekElement peekElement;

    @BeforeEach
    void setUp() {
        peekElement = new PeekElement();
    }

    @Test
    void testCase1() {
        final int[] test = {1,2,3,1};

        final int expected = 2;

        assertEquals(expected, peekElement.findPeakElement(test));
    }

    @Test
    void testCase2() {
        final int[] test = {1,2,1,3,5,6,4};

        final int expected = 1;

        assertEquals(expected, peekElement.findPeakElement(test));
    }
}
