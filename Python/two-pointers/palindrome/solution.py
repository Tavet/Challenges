# Write a function that takes a string, s, as an input and determines whether or not it is a palindrome.
# Note: A palindrome is a word, phrase, or sequence of characters that reads the same backward as forward.
#  The string s will not contain any white space and will only consist of ASCII characters(digits and letters).

class Solution:
    def is_palindrome(self, s):
        l_pointer = 0
        r_pointer = len(s) - 1

        while l_pointer <= r_pointer:
            if s[l_pointer] != s[r_pointer]:
                return False
            l_pointer += 1
            r_pointer -= 1
        return True





