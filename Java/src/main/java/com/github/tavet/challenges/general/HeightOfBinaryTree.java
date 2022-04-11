package com.github.tavet.challenges.general;

import com.github.tavet.utility.Node;

/**
 * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
 */
public class HeightOfBinaryTree {

    public int height(Node root) {
        if(root == null) {
            return -1;
        }

        int leftNode = height(root.left);
        int rightNode = height(root.right);

        return (rightNode > leftNode ? rightNode : leftNode) + 1;
    }
}
