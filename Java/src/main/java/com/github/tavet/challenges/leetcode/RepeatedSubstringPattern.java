package com.github.tavet.challenges.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

** Example 1:
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.

** Example 2:
Input: s = "aba"
Output: false

** Example 3:
Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.


** Constraints:
1 <= s.length <= 104
s consists of lowercase English letters.
 */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder pattern = new StringBuilder();
        if(s.length() == 1)
            return false;

        for (int i = 0; i < s.length(); i++) {
            pattern.append(s.charAt(i));
            int count = 0;
            Matcher matcher = Pattern.compile(pattern.toString()).matcher(s);
            while (matcher.find()) {
                count++;
            }
            if (count == s.length() || s.length() % count == 0 &&
                    s.length() % pattern.length() == 0 && // The number of repeated patterns should fit the string
                    s.length() != pattern.length() && // Pattern should have different length
                    !s.equalsIgnoreCase(pattern.toString()) && // Not equal strings
                    pattern.length() * count == s.length()) {
                return true;
            }
        }
        return false;
    }
}
