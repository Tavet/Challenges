package com.github.tavet.challenges.leetcode;

/*
https://leetcode.com/problems/magic-squares-in-grid/description/?envType=daily-question&envId=2024-08-09

A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9 such that each row, column, and both diagonals all have the same sum.

Given a row x col grid of integers, how many 3 x 3 contiguous magic square subgrids are there?

Note: while a magic square can only contain numbers from 1 to 9, grid may contain numbers up to 15.
 */
public class MagicSquares {
    public int numMagicSquaresInside(int[][] grid) {
        if (grid.length < 2 || grid[0].length < 2)
            return 0;

        int ans = 0;
        int rightMoves = grid[0].length - 3;
        int bottomMoves = grid.length - 3;

        for (int i = 0; i < rightMoves + 1; i++) {
            for (int j = 0; j < bottomMoves + 1; j++) {
                if (isValid(grid, j, i))
                    ans++;
            }
        }

        return ans;
    }

    private boolean isValid(int[][] grid, int row, int col) {
        // Print the grid elements being checked
//         System.out.println("Grid values:");
//         System.out.println(grid[row][col] + " " + grid[row][col+1] + " " + grid[row][col+2]);
//         System.out.println(grid[row+1][col] + " " + grid[row+1][col+1] + " " + grid[row+1][col+2]);
//         System.out.println(grid[row+2][col] + " " + grid[row+2][col+1] + " " + grid[row+2][col+2]);
        final int target = 15; // target

        return containsUniqueNumbers(grid, row, col) &&
                numbersAreFrom1to9(grid, row, col) &&
                target == grid[row][col] + grid[row][col + 1] + grid[row][col + 2] && // 1st row
                target == grid[row + 1][col] + grid[row + 1][col + 1] + grid[row + 1][col + 2] && // 2nd row
                target == grid[row + 2][col] + grid[row + 2][col + 1] + grid[row + 2][col + 2] && // 3rd row
                target == grid[row][col] + grid[row + 1][col] + grid[row + 2][col] && // 1st column
                target == grid[row][col + 1] + grid[row + 1][col + 1] + grid[row + 2][col + 1] && // 2nd column
                target == grid[row][col + 2] + grid[row + 1][col + 2] + grid[row + 2][col + 2] && // 3rd column
                target == grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2] && // left diagonal
                target == grid[row][col + 2] + grid[row + 1][col + 1] + grid[row + 2][col]; // right diagonal

    }

    private boolean containsUniqueNumbers(int[][] grid, int row, int col) {
        return grid[row][col] != grid[row][col + 1] && grid[row][col] != grid[row][col + 2] &&
                grid[row + 1][col] != grid[row + 1][col + 1] && grid[row + 1][col] != grid[row + 1][col + 2] &&
                grid[row + 2][col] != grid[row + 2][col + 1] && grid[row + 2][col] != grid[row + 2][col + 2];
    }

    private boolean numbersAreFrom1to9(int[][] grid, int row, int col) {
        return grid[row][col] <= 9 && grid[row][col + 1] <= 9 && grid[row][col + 2] <= 9 &&
                grid[row+1][col] <= 9 && grid[row+1][col + 1] <= 9 && grid[row+1][col + 2] <= 9 &&
                grid[row+2][col] <= 9 && grid[row+2][col + 1] <= 9 && grid[row+2][col + 2] <= 9;
    }
}
