package com.github.tavet.challenges.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NewYearChaosTest {
    NewYearChaos newYearChaos;

    @BeforeEach
    void setUp() {
        newYearChaos = new NewYearChaos();
    }

    @Test
    void testCase1() {
        final List<Integer> input = Arrays.asList(2, 1, 5, 3, 4);
        final String expected = "3";

        assertEquals(expected, newYearChaos.minimumBribes(input));
    }

    @Test
    void testCase2() {
        final List<Integer> input = Arrays.asList(2, 5, 1, 3, 4);
        final String expected = "Too chaotic";

        assertEquals(expected, newYearChaos.minimumBribes(input));
    }

    @Test
    void testCase3() {
        final List<Integer> input = Arrays.asList(1, 2, 5, 3, 4, 7, 8, 6);
        final String expected = "4";

        assertEquals(expected, newYearChaos.minimumBribes(input));
    }

    @Test
    void testCase4() {
        // 1, 2, 5, 3, 7, 8, 6, 4
        // 1, 2, 3, 4, 5, 6, 7, 8
        final List<Integer> input = Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4);
        final String expected = "7";

        assertEquals(expected, newYearChaos.minimumBribes(input));
    }

    @Test
    void testCase5() {
        final List<Integer> input = Arrays.asList(3, 2, 1, 4, 6, 5, 8, 7, 9, 12, 11, 10);
        final String expected = "6";

        assertEquals(expected, newYearChaos.minimumBribes(input));
    }
}
