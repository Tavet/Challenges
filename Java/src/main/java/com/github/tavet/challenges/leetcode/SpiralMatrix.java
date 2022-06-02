package com.github.tavet.challenges.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/spiral-matrix/
 * Explanation: https://www.youtube.com/watch?v=BJnMZNwUk1M&
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int top = 0, left = 0, bottom = matrix.length, right = matrix[0].length;

        while (left <= right && top <= bottom) {

            for (int i = left; i < right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i < bottom; i++) {
                ans.add(matrix[i][right - 1]);
            }
            right--;

            if (left >= right || top >= bottom)
                break;

            for (int i = right - 1; i > left - 1; i--) {
                ans.add(matrix[bottom - 1][i]);
            }
            bottom--;

            for (int i = bottom - 1; i > top - 1; i--) {
                ans.add(matrix[i][left]);
            }
            left++;
        }

        return ans;
    }
}
