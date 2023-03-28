package com.github.tavet.challenges.general;

public class LambdaExpressions {
    interface PerformOperation {
        boolean check(int a);
    }

    class MyMath {
        public static boolean checker(PerformOperation p, int num) {
            return p.check(num);
        }

        // Write your code here
        public PerformOperation isOdd() {
            return a -> a % 2 != 0;
        }

        public PerformOperation isPrime() {
            return a -> {
                if (a <= 1) {
                    return false;
                }
                for (int i = 0; i < a; i++) {
                    if (a % i == 0) {
                        return false;
                    }
                }
                return true;
            };
        }

        public PerformOperation isPalindrome() {
            return a -> Integer.toString(a) == new StringBuilder(Integer.toString(a)).reverse().toString();
        }
    }
}
