package com.github.tavet.challenges.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerMostWaterTest {
    ContainerMostWater containerMostWater;

    @BeforeEach
    void setUp() {
        containerMostWater = new ContainerMostWater();
    }

    @Test
    void testCase1() {
        final int[] test = {1,8,6,2,5,4,8,3,7};

        final int expected = 49;

        assertEquals(expected, containerMostWater.maxArea(test));
    }

    @Test
    void testCase2() {
        final int[] test = {2,3,4,5,18,17,6};

        final int expected = 17;

        assertEquals(expected, containerMostWater.maxArea(test));
    }

}
