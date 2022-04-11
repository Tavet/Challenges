package com.github.tavet.challenges.general;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/contacts/problem
 */
public class Contacts {

    public List<Integer> contacts(List<List<String>> queries) {
        List<Integer> answer = new ArrayList<>();
        List<String> contacts = new ArrayList<>();

        queries.forEach(q -> {
            String term = q.get(1);
            if(q.get(0).equalsIgnoreCase("add")) {
                contacts.add(term);
            } else {
                answer.add(contacts.parallelStream().filter(s -> s.startsWith(term))
                        .collect(Collectors.reducing(0, e -> 1, Integer::sum)));
            }
        });

        return answer;
    }
}
