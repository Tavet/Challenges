package com.github.tavet.challenges.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LeftRotationTest {
    LeftRotation leftRotation;

    @BeforeEach
    void setUp() {
        leftRotation = new LeftRotation();
    }

    @Test
    void testCase1() {
        List<Integer> expected = Arrays.asList(5, 1, 2, 3, 4);
        List<Integer> answer = leftRotation.rotLeft(
                new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5)),
                4);
        assertEquals(expected, answer);
    }
}
