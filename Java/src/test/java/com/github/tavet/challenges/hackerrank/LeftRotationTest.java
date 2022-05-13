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

    @Test
    void testCase2() {
        List<Integer> expected = Arrays.asList(87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60);
        List<Integer> answer = leftRotation.rotLeft(
                new LinkedList<>(Arrays.asList(33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97)),
                13);
        assertEquals(expected, answer);
    }

    @Test
    void testCase3() {
        List<Integer> expected = Arrays.asList(77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84,
                77);
        List<Integer> answer = leftRotation.rotLeft(
                new LinkedList<>(
                        Arrays.asList(41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51)),
                10);
        assertEquals(expected, answer);
    }
}
