package com.github.tavet.challenges.hackerrank;

/**
 * https://www.hackerrank.com/challenges/append-and-delete/problem
 */
public class AppendAndDelete {
    public String appendAndDelete(String s, String t, int k) {

        if (s.equals(t)) {
            return "Yes";
        } else if (Math.abs(s.length() - t.length()) > k) { // If the difference in characters in S-T is greater than K
            return "No";
        } else if ((s.charAt(0) != t.charAt(0) && k > s.length() + t.length())) { // if k > characters of s + t, and the first element is different then it can be deleted
            return "Yes";
        }

        int moves = 0;

        for (int i = 0; i < Math.max(s.length(), t.length()); i++) {
            if (i >= s.length()) {
                moves += 1;
            } else if ((s.length() > t.length() && i > t.length() - 1)) {
                moves += 1;
            } else if ((t.length() > s.length() && i > s.length() - 1)) {
                moves += 1;
            } else if (s.charAt(i) != t.charAt(i) || (s.charAt(i) == t.charAt(i) && moves > 0)) {
                moves += 2;
            }
        }

        // If moves < k, check if the remaining can be deleted
        if (moves > k) {
            return "No";
        } else if ((k - moves) % 2 == 0 || // if the left moves are even - it can be delete - add or add - delete and
                                           // get the result
                t.length() - (k - moves) % 2 == 0 // it means it can delete - delete - delete ... if it's empty and
                                                  // then perform an "add"
        ) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
