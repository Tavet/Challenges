package com.github.tavet.challenges.general;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindRunningMediaTest {
    FindRunningMedia findRunningMedia;

    @BeforeEach
    void setUp() {
        findRunningMedia = new FindRunningMedia();
    }

    @Test
    void testCase1() {
        final List<Double> answer = Arrays.asList(12.0, 8.0, 5.0, 4.5, 5.0, 6.0);
        assertEquals(answer, findRunningMedia.runningMedian(Arrays.asList(6, 12, 4, 5, 3, 8, 7)));
    }

    @Test
    void testCase2() {
        final List<Double> answer = Arrays.asList(1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5);
        assertEquals(answer, findRunningMedia.runningMedian(Arrays.asList(10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
    }
}
