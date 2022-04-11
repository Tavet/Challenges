package com.github.tavet.challenges.general;

import com.github.tavet.utility.Node;

import java.util.LinkedList;

/**
 * https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
 */
public class TreeLevelOrderTraversal {

    void levelOrder(Node root) {
        LinkedList<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while(!nodes.isEmpty()) {
            Node left = nodes.peek().left;
            Node right = nodes.peek().right;

            if(left != null) {
                nodes.add(left);
            }

            if(right != null) {
                nodes.add(right);
            }

            System.out.print(nodes.poll().data + " -> ");
        }
    }
}
