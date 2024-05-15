import unittest

from solution import Solution


class SolutionTest(unittest.TestCase):
    def test_is_palindrome_1(self):
        s = Solution()
        result = s.is_palindrome("baab")
        self.assertTrue(result)

    def test_is_palindrome_2(self):
        s = Solution()
        result = s.is_palindrome("baabb")
        self.assertFalse(result)
