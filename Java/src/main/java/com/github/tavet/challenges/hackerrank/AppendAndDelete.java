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
        }

        int moves = 0;

        for (int i = 0; i < Math.max(s.length(), t.length()); i++) {
            if (moves > k) {
                return "No";
            }

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

        return moves == k || moves < k && s.charAt(0) != t.charAt(0) ? "Yes" : "No";
    }
}
