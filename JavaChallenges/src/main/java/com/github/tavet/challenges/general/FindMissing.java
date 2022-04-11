package challenges.general;

/*
You are given an array of positive numbers from 1 to n, such that all numbers from 1
to n are present except one number x. You have to find x. The input array is not sorted.
Look at the below array and give it a try before checking the solution.

[3, 7, 1, 2, 8, 4, 5]

n = 8 missing number = 6
*/

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.lang.String.format;

public class FindMissing {

    public static void main(String[] args) {
        int array[] = {3, 7, 1, 2, 8, 4, 5};

        checkArray(array);
    }

    static void checkArray(int array[]) {
        // Sum all the numbers in the array
        int sumArray = Arrays.stream(array).sum();

        // Find the max number
        int max = Arrays.stream(array).max().orElse(0);

        // Sum numbers from 1 to max
        int expectedSum = IntStream.iterate(1, n -> n + 1)
                .limit(max)
                .sum();

        // Find the difference. If == 0 then there is no missing number
        int difference = Math.abs(sumArray - expectedSum);

        if(difference == 0) {
            System.out.println("Everything is ok!");
        } else {
            System.out.println(format("Number %d is missing", difference));
        }
    }
}
