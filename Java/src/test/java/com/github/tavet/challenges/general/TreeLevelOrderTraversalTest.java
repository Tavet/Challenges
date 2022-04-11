package com.github.tavet.challenges.general;

import com.github.tavet.utility.Node;
import com.github.tavet.utility.TreePrinter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TreeLevelOrderTraversalTest {
    TreeLevelOrderTraversal treeLevelOrderTraversal;

    @BeforeEach
    void setUp() {
        treeLevelOrderTraversal = new TreeLevelOrderTraversal();
    }

    /**
     *      1
     *       \
     *        2
     *         \
     *          5
     *         /  \
     *        3    6
     *         \
     *          4
     *
     *  Expected order is: 1 -> 2 -> 5 -> 3 -> 6 -> 4
     */
    @Test
    void testCase1() {
        Node root = new Node(1);
        Node a = Node.insert(root, 2);
        Node b = Node.insert(a, 5);
        Node c = Node.insert(b, 3);
        Node.insert(b, 6);
        Node.insert(c, 4);

        treeLevelOrderTraversal.levelOrder(root);
    }
}
