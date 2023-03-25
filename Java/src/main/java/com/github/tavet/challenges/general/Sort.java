package com.github.tavet.challenges.general;

public class Sort {

    public int[] bubbleSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int lock = input.length - 1;
            int greatest = Integer.MIN_VALUE;

            for (int j = 0; j < lock; j++) {
                // get the greatest number before the lock
                if(greatest != input[lock] && greatest < input[j]) {
                    greatest = input[j];
                }
                // sort
                if (j + 1 != input.length) {
                    // Interchange values without a temp variable
                    // B = B + A
                    // A = B - A
                    // B = B - A
                    if (input[j] > input[j + 1]) {
                        input[j + 1] = input[j + 1] + input[j];
                        input[j] = input[j + 1] - input[j];
                        input[j + 1] = input[j + 1] - input[j];
                    }
                }
                // if greatest has reached the last locked position, then loop through less elements
                if(greatest == input[lock]) {
                    lock--;
                }
            }
            // if it already locked all sorted elements, then stop
            if(lock <= 0)
                break;
        }
        return input;
    }
}
