package com.github.tavet.challenges.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppendAndDeleteTest {
    AppendAndDelete appendAndDelete;

    @BeforeEach
    void setUp() {
        appendAndDelete = new AppendAndDelete();
    }

    @Test
    void testCase1() {
        final String expected = "No";
        String s = "ashley";
        String t = "ash";
        int k = 2;
        
        assertEquals(expected, appendAndDelete.appendAndDelete(s, t, k));
    }

    @Test
    void testCase2() {
        final String expected = "Yes";
        String s = "aba";
        String t = "aba";
        int k = 7;
        
        assertEquals(expected, appendAndDelete.appendAndDelete(s, t, k));
    }

    @Test
    void testCase3() {
        final String expected = "Yes";
        String s = "hackerhappy";
        String t = "hackerrank";
        int k = 9;
        
        assertEquals(expected, appendAndDelete.appendAndDelete(s, t, k));
    }
}
