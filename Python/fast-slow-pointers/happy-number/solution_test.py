import unittest

from solution import Solution


class SolutionTest(unittest.TestCase):
    def test_is_happy_number_1(self):
        s = Solution()
        result = s.is_happy_number(28)
        self.assertTrue(result)

    def test_is_happy_number_2(self):
        s = Solution()
        result = s.is_happy_number(4)
        self.assertFalse(result)
