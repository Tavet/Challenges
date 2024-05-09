import unittest

from solution import Solution

class SolutionTest(unittest.TestCase):
    def test_remove_duplicates(self):
        s = Solution()
        result = s.removeDuplicates([1,1,2])
        self.assertEquals(2, result)

    def test_remove_duplicates_2(self):
        s = Solution()
        nums = [0,0,1,1,1,2,2,3,3,4]
        result = s.removeDuplicates(nums)
        self.assertEquals([0,1,2,3,4], nums)
        self.assertEquals(5, result)

    def test_remove_duplicates_3(self):
        s = Solution()
        nums = [0,0,0,0,0]
        result = s.removeDuplicates(nums)
        self.assertEquals([0], nums)
        self.assertEquals(1, result)
