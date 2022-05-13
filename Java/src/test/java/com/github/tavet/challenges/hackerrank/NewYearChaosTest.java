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
}
