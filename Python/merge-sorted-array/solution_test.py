import unittest

from solution import Solution

class SolutionTest(unittest.TestCase):
    def test_merge_sorted_array_1(self):
        s = Solution()
        result = s.merge([1,2,3,0,0,0], 3, [2,5,6], 3)
        self.assertEquals([1, 2, 2, 3, 5, 6], result)

    def test_merge_sorted_array_2(self):
        s = Solution()
        result = s.merge([1], 1, [], 0)
        self.assertEquals([1], result)

    def test_merge_sorted_array_3(self):
        s = Solution()
        result = s.merge([0], 0, [1], 1)
        self.assertEquals([1], result)

    def test_merge_sorted_array_4(self):
        s = Solution()
        result = s.merge([2,0], 1, [1], 1)
        self.assertEquals([1, 2], result)

    def test_merge_sorted_array_5(self):
        s = Solution()
        result = s.merge([1,2,3,0,0,0], 3, [4,5,6], 3)
        self.assertEquals([1,2,3,4,5,6], result)