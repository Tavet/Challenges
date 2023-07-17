import unittest

from solution import Solution


class SolutionTest(unittest.TestCase):
    def test_two_sum_t1(self):
        twosum = Solution()
        result = twosum.solution([2, 7, 11, 15], 9)
        self.assertCountEqual([0, 1], result)

    def test_two_sum_t2(self):
        twosum = Solution()
        result = twosum.solution([3, 3], 6)
        self.assertCountEqual([0, 1], result)

    def test_two_sum_t3(self):
        twosum = Solution()
        result = twosum.solution([-1, -2, -3, -4, -5], -8)
        self.assertCountEqual([2, 4], result)