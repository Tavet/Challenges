# Given a string, s, that represents a DNA subsequence, and a number k
# return all the contiguous subsequences (substrings) of length k
# that occur more than once in the string. The order of the returned subsequences does not matter.
# If no repeated substring is found, the function should return an empty set.
import math


class Solution:
    def find_repeated_sequences(self, s, k):
        unique_sequences_set = set()
        output = set()
        iterate_to = len(s) - k if k > 1 else len(s)
        for i in range(0, iterate_to):
            l_index = i
            r_index = i + k
            pattern = s[l_index:r_index]
            if pattern not in unique_sequences_set:
                unique_sequences_set.add(pattern)
            else:
                output.add(pattern)

        return output
