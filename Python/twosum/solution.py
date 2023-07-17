from typing import List


# https://leetcode.com/problems/two-sum/
class Solution:

    def solution(self, nums: List[int], target: int) -> List[int]:
        num_dic = {}
        n = len(nums)

        for i in range(n):
            num_dic[nums[i]] = i

        for i in range(n):
            diff = target - nums[i]
            if diff in num_dic and num_dic[diff] != i:
                return [num_dic.get(diff), i]

        return []