package com.github.tavet.challenges.hackerrank;

/**
 * https://www.hackerrank.com/challenges/append-and-delete/problem
 */
public class AppendAndDelete {
    public String appendAndDelete(String s, String t, int k) {
        boolean possible = false;

        if (s.equals(t)) {
            return "Yes";
        } else if (Math.abs(s.length() - t.length()) > k) { // If the difference in characters in S-T is greater than K
            return "No";
        }

        int differenceInChars = 0;
        int differenceStartsAt = 0;
        if (s.length() <= t.length()) {
            for (int i = 0; i < s.length(); i++) { // loop through S which has less elements
                if (s.charAt(i) != t.charAt(i)) {
                    int leftCharacters = t.length() - s.length();
                    differenceInChars += ((s.length() - i) * 2) + leftCharacters;
                    differenceStartsAt = i;
                    break;
                }
            }
        } else {
            differenceInChars = s.length() - t.length(); // difference starts with the left characters in S
            for (int i = 0; i < t.length(); i++) { // loop through T which has less elements
                if (s.charAt(i) != t.charAt(i)) {
                    differenceInChars += (t.length() - i) * 2; // multiply by 2 because the operations must be done
                                                               // twice: remove and add
                    differenceStartsAt = i;
                    break; // If the character is different, it means the next elements must be deleted in
                           // order to come to the current character,
                    // then we break the cycle and count he next elements
                }
            }
        }

        if (differenceInChars > k) {
            return "No";
        } else {
            StringBuilder newS = new StringBuilder(s);
            if (s.length() <= t.length()) {

                for (int i = 0; i < t.length(); i++) {
                    if (i < s.length() && i >= differenceStartsAt) {
                        newS.setCharAt(i, t.charAt(i));
                    } else if (i >= s.length()) {
                        newS.append(t.charAt(i));
                    }
                }
            } else {
                for (int i = 0; i < s.length(); i++) {
                    if (i < t.length() && i >= differenceStartsAt) {
                        newS.setCharAt(i, t.charAt(i));
                    } else if (i >= differenceStartsAt) {
                        newS.deleteCharAt(i);
                    }
                }
            }

            if (newS.toString().equals(t)) {
                possible = true;
            }
        }

        return possible ? "Yes" : "No";
    }
}
