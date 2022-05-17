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

    @Test
    void testCase4() {
        final String expected = "Yes";
        String s = "hackerrank";
        String t = "hackerhappy";
        int k = 9;

        assertEquals(expected, appendAndDelete.appendAndDelete(s, t, k));
    }

    @Test
    void testCase5() {
        final String expected = "Yes";
        String s = "uoiauwrebgiwrhgiuawheirhwebvjforidkslweufgrhvjqasw";
        String t = "vgftrheydkoslwezxcvdsqjkfhrydjwvogfheksockelsnbkeq";
        int k = 100;

        assertEquals(expected, appendAndDelete.appendAndDelete(s, t, k));
    }

    @Test
    void testCase6() {
        final String expected = "No";
        String s = "abce";
        String t = "abcdert";
        int k = 10;

        assertEquals(expected, appendAndDelete.appendAndDelete(s, t, k));
    }

    @Test
    void testCase7() {
        final String expected = "Yes";
        String s = "abcdef";
        String t = "fedcba";
        int k = 15;

        assertEquals(expected, appendAndDelete.appendAndDelete(s, t, k));
    }

    @Test
    void testCase8() {
        final String expected = "Yes";
        String s = "aaa";
        String t = "a";
        int k = 5;

        assertEquals(expected, appendAndDelete.appendAndDelete(s, t, k));
    }

    @Test
    void testCase9() {
        final String expected = "No";
        String s = "y";
        String t = "yu";
        int k = 2;

        assertEquals(expected, appendAndDelete.appendAndDelete(s, t, k));
    }

    @Test
    void testCase10() {
        final String expected = "Yes";
        String s = "zzzzz";
        String t = "zzzzzzz";
        int k = 4;

        assertEquals(expected, appendAndDelete.appendAndDelete(s, t, k));
    }

    @Test
    void testCase11() {
        final String expected = "No";
        String s = "qwerasdf";
        String t = "qwerbsdf";
        int k = 6;

        assertEquals(expected, appendAndDelete.appendAndDelete(s, t, k));
    }
}
