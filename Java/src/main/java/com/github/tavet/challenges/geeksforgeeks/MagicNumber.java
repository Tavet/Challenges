package com.github.tavet.challenges.geeksforgeeks;

/*
A number is said to be a magic number, if the sum of its digits are calculated till a single digit recursively by adding the sum of the digits after every addition. If the single digit comes out to be 1,then the number is a magic number.

For example:
Number= 50113
=> 5+0+1+1+3=10
=> 1+0=1
This is a Magic Number

For example:
Number= 1234
=> 1+2+3+4=10
=> 1+0=1
This is a Magic Number
 */
public class MagicNumber {
    /*
    public boolean isMagicNumber(int number) {
        int sum = 0;
        int magic = 0;
        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }

        while(sum > 0) {
            magic += sum % 10;
            sum = sum / 10;
        }

        return magic == 1;
    } */

    // Optimized recursive solution
    public boolean isMagicNumber(int number) {
        return isMagicNumber(number, 0);
    }

    public boolean isMagicNumber(int number, int sum) {
        if (number > 0 || sum > 9) {
            if (number == 0) {
                number = sum;
                sum = 0;
            }

            sum += number % 10;
            number /= 10;
            return isMagicNumber(number, sum);
        }
        return sum == 1;
    }

}
