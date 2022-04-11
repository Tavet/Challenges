package com.github.tavet.challenges.general;

import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/ctci-bfs-shortest-reach/problem
 */

public class BalanceBrackets {

    public String checkBalance(String input) {
        Stack<Character> balance = new Stack<>();
        if(input.length() % 2 != 0) {
            return "NO";
        } else {
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == '{') {
                    balance.push('}');
                } else if(input.charAt(i) == '[') {
                    balance.push(']');
                } else if(input.charAt(i) == '(') {
                    balance.push(')');
                } else if(balance.empty() || balance.pop() != input.charAt(i)) {
                    break;
                }
            }
        }
        return balance.empty() ? "YES" : "NO";
    }


}
