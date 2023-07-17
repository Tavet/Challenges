import unittest

from solution import Solution

class SolutionTest(unittest.TestCase):
    def test_add_two_numbers_t1(self):
        s = Solution()
        result = s.solution([2, 7, 11, 15], 9)
        self.assertCountEqual([0, 1], result)