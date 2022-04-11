package com.github.tavet.challenges.general;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactsTest {
    Contacts contacts;

    @BeforeEach
    void setUp() {
        contacts = new Contacts();
    }

    @Test
    void testCase1() {
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("add", "hack"));
        queries.add(Arrays.asList("add", "hackerrank"));
        queries.add(Arrays.asList("find", "hac"));
        queries.add(Arrays.asList("find", "hak"));

        List<Integer> expected = Arrays.asList(2, 0);
        assertEquals(expected, contacts.contacts(queries));
    }

    @Test
    void testCase2() {
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("add", "ed"));
        queries.add(Arrays.asList("add", "eddie"));
        queries.add(Arrays.asList("add", "edward"));
        queries.add(Arrays.asList("find", "ed"));
        queries.add(Arrays.asList("add", "edwina"));
        queries.add(Arrays.asList("find", "edw"));
        queries.add(Arrays.asList("find", "a"));

        List<Integer> expected = Arrays.asList(3, 2, 0);
        assertEquals(expected, contacts.contacts(queries));
    }
}
