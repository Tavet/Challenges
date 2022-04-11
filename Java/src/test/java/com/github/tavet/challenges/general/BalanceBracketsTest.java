package com.github.tavet.challenges.general;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BalanceBracketsTest {
    BalanceBrackets balanceBrackets;

    @BeforeEach
    void setUp() {
        balanceBrackets = new BalanceBrackets();
    }

    @Test
    void testCase1() {
        final String test = "{[()]}";
        assertEquals(balanceBrackets.checkBalance(test), "YES");
    }

    @Test
    void testCase2() {
        final String test = "{[(])}";
        assertEquals(balanceBrackets.checkBalance(test), "NO");
    }

    @Test
    void testCase3() {
        final String test = "{{[[(())]]}}";
        assertEquals(balanceBrackets.checkBalance(test), "YES");
    }
}
