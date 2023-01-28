package com.github.tavet.challenges.leetcode;

import com.github.tavet.challenges.util.File;
import org.apache.commons.lang3.time.StopWatch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstMissingPositiveTest {
    FirstMissingPositive firstMissingPositive;

    @BeforeEach
    void setUp() {
        firstMissingPositive = new FirstMissingPositive();
    }

    @Test
    void testCase1() {
        final int[] test = {1, 2, 0};

        final int expected = 3;

        assertEquals(expected, firstMissingPositive.firstMissingPositive(test));
    }

    @Test
    void testCase2() {
        final int[] test = {3, 4, -1, 1};

        final int expected = 2;

        assertEquals(expected, firstMissingPositive.firstMissingPositive(test));
    }

    @Test
    void testCase3() {
        final int[] test = {7, 8, 9, 11, 12};

        final int expected = 1;

        assertEquals(expected, firstMissingPositive.firstMissingPositive(test));
    }

    @Test
    void testCase4() {
        final int[] test = {1};

        final int expected = 2;

        assertEquals(expected, firstMissingPositive.firstMissingPositive(test));
    }

    @Test
    void testCase5() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        final int[] test = File.getInstance().readIntFile("leetcode/FirstMissingPositiveLargeInput.txt");
        final int expected = 100001;
        assertEquals(expected, firstMissingPositive.firstMissingPositive(test));

        stopWatch.stop();
        assertTrue(stopWatch.getTime() < TimeUnit.SECONDS.toMillis(1), "Taken time: " + stopWatch.getTime());
    }

    @Test
    void testCase6() {
        final int[] test = {0,2,2,1,1};

        final int expected = 3;

        assertEquals(expected, firstMissingPositive.firstMissingPositive(test));
    }
}
