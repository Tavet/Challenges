package com.github.tavet.challenges.hackerrank;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
 */
public class LeftRotation {
    public List<Integer> rotLeft(List<Integer> a, int d) {
        int nRotations = d >= a.size() ? d % a.size() : d; // If rotations >= list size then skip extra rotations

        for (int i = 0; i < nRotations; i++) {
            int firstElement = a.remove(0);
            a.add(firstElement);
        }

        return a;
    }
}
