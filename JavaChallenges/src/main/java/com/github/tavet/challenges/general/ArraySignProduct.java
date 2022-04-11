package challenges.general;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/*
Write a function solution that, given an array A of N integers (between -100 and 100),
returns the sign (-1, 0, 1) of the product of all the numbers in the array multiplied together.
Assume that N is between 1 and 1000

     * Example test:   [1, -2, -3, 5]
     * Returned value: 1
     *
     * Example test:   [1, 2, 3, -5]
     * Returned value: -1
     *
     * Example test:   [1, 2, 0, -5]
     * Returned value: 0
 */
public class ArraySignProduct {
    public static void main(String[] args) {

        int[] testCase = {1, -2, -3, 5};
        System.out.println("Solution: " + solution(testCase));
    }

    static int solution(int[] A) {
        // Find if there is a zero
        OptionalInt zero = IntStream.of(A).parallel().filter(v -> v == 0).findFirst();
        if(zero.isPresent()) {
            return 0;
        }

        // Find quantity of negative numbers
        long negatives = IntStream.of(A).parallel().filter(v -> v < 0).count();
        // If the count of negative numbers is odd, then the multiplication should be negative
        if(negatives % 2 != 0) {
            return -1;
        }

        return 1;
    }
}
