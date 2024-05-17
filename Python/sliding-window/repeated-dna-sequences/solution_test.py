import unittest

from solution import Solution


class SolutionTest(unittest.TestCase):
    def test_find_repeated_sequence_1(self):
        s = Solution()
        result = s.find_repeated_sequences("ATATATATATATATAT", 6)
        result.__contains__("ATATAT")
        result.__contains__("TATATA")
        self.assertEquals(2, len(result))

    def test_find_repeated_sequence_2(self):
        s = Solution()
        result = s.find_repeated_sequences("AAAAACCCCCAAAAACCCCCC", 8)
        result.__contains__("AAAAACCC")
        result.__contains__("AAAACCCC")
        result.__contains__("AAACCCCC")
        self.assertEquals(3, len(result))

    def test_find_repeated_sequence_3(self):
        s = Solution()
        result = s.find_repeated_sequences("GGGGGGGGGGGGGGGGGGGGGGGGG", 9)
        result.__contains__("GGGGGGGGG")
        self.assertEquals(1, len(result))

    def test_find_repeated_sequence_4(self):
        s = Solution()
        result = s.find_repeated_sequences("CGG", 1)
        result.__contains__("G")
        self.assertEquals(1, len(result))
