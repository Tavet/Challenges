package com.github.tavet.challenges.leetcode;

import java.util.Arrays;

/*
https://leetcode.com/problems/first-missing-positive/

Given an unsorted integer array nums, return the smallest missing positive integer.
You must implement an algorithm that runs in O(n) time and uses constant extra space.

** Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.

** Example 2:
Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.

** Example 3:
Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums); // Order first
        int num = 1;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i] > 0) { // This ignores negative/zero numbers
                if(nums[i] != num) {
                    return num;
                }
                if(i + 1 < nums.length && nums[i] != nums[i + 1])  { // If current number is not equal to the next, then increase num
                    num++;
                } else {
                    if(i + 1 == nums.length) { // If next number reaches last position, then increase num
                        num++;
                    }
                }
            }
        }
        return num;
    }
}
