package com.github.tavet.challenges.general;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwapNodesTest {
    SwapNodes swapNodes;

    @BeforeEach
    void setUp() {
        swapNodes = new SwapNodes();
    }

    @Test
    void testCase1() {
        List<List<Integer>> indexes = new ArrayList<>();
        indexes.add(Arrays.asList(2, 3));
        indexes.add(Arrays.asList(-1, -1));
        indexes.add(Arrays.asList(-1, -1));

        List<Integer> queries = new ArrayList<>();
        queries.add(1);
        queries.add(1);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3, 1, 2));
        expected.add(Arrays.asList(2, 1, 3));

        assertEquals(expected, swapNodes.swapNodes(indexes, queries));
    }
}
