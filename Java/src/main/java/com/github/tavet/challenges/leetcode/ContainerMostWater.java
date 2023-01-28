package com.github.tavet.challenges.leetcode;

/*
https://leetcode.com/problems/container-with-most-water/

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 */
public class ContainerMostWater {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0, j = height.length - 1;

        do {
            int minY = Math.min(height[i], height[j]); // Find minor
            int calcArea = (j - i) * minY; // Calculate area L * L
            if(calcArea > maxArea) {
                maxArea = calcArea;
            }

            // move the minor pointer
            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        } while(i != j);

        return maxArea;
    }
}
