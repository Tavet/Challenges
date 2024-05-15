# Given an array of integers, nums, and an integer value, target, determine if there are any three integers
# in nums whose sum is equal to the target, that is, nums[i] + nums[j] + nums[k] == target.
# Return TRUE if three such integers exist in the array. Otherwise, return FALSE.

# Note: A valid triplet consists of elements with distinct indexes.
class Solution:
    def find_sum_of_three(self, nums, target):
        # Sort the array
        nums.sort()
        indexes = []

        # Iteration.
        # The left index will be 1 space after the current idx index
        # The right index will be at the end
        # Since Left and Right indexes can occupy the last 2 spaces, then we iterate from 0 to the length of nums - 2
        # According to the sum of the 3 numbers, we update one of the two pointers

        for idx in range(0, len(nums) - 2):
            l_index = idx + 1
            r_index = len(nums) - 1

            while l_index < r_index:
                indexes.append(idx)
                indexes.append(l_index)
                indexes.append(r_index)
                sum_of_elements = 0
                for el_idx in indexes:
                    sum_of_elements += nums[el_idx]
                indexes = []
                if sum_of_elements > target:
                    r_index -= 1
                elif sum_of_elements < target:
                    l_index += 1
                else:
                    return True
        return False








