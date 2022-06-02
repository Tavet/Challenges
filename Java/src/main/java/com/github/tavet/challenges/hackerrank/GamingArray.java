package com.github.tavet.challenges.hackerrank;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/an-interesting-game-1/problem?isFullScreen=false
 */
public class GamingArray {
    // Bob starts first = Odd moves
    // Then andy = Even moves

    public String gamingArray(List<Integer> arr) {
        int moves = 0;
        int bigger = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= bigger) {
                moves++;
            }
        }

        return moves % 2 == 0 ? "ANDY" : "BOB";
    }

}
