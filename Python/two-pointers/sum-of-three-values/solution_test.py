import unittest

from solution import Solution


class SolutionTest(unittest.TestCase):
    def test_find_sum_of_three_1(self):
        s = Solution()
        result = s.find_sum_of_three([2, 3, 1], 6)
        self.assertTrue(result)

    def test_find_sum_of_three_2(self):
        s = Solution()
        result = s.find_sum_of_three([3, 7, 1, 2, 8, 4, 5], 20)
        self.assertTrue(result)

    def test_find_sum_of_three_3(self):
        s = Solution()
        result = s.find_sum_of_three([1, -1, 1], 2)
        self.assertFalse(result)

    def test_find_sum_of_three_4(self):
        s = Solution()
        result = s.find_sum_of_three([3, 7, 1, 2, 8, 4, 5], 10)
        self.assertTrue(result)

    def test_find_sum_of_three_5(self):
        s = Solution()
        result = s.find_sum_of_three([-1, 2, 1, -4, 5, -3], 0)
        self.assertTrue(result)

    def test_find_sum_of_three_6(self):
        s = Solution()
        result = s.find_sum_of_three([-1, 2, 1, -4, 5, -3], -8)
        self.assertTrue(result)
