package com.github.tavet.challenges.geeksforgeeks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MagicNumberTest {
    MagicNumber magicNumber;

    @BeforeEach
    void setUp() {
        magicNumber = new MagicNumber();
    }

    @Test
    void testCase1() {
        int input = 1234;
        assertTrue(magicNumber.isMagicNumber(input));
    }

    @Test
    void testCase2() {
        int input = 50113;
        assertTrue(magicNumber.isMagicNumber(input));
    }

    @Test
    void testCase3() {
        int input = 11111;
        assertFalse(magicNumber.isMagicNumber(input));
    }
}
