package com.github.tavet.challenges.general;

import com.github.tavet.utility.Node;
import com.github.tavet.utility.TreePrinter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeightOfBinaryTreeTest {
    HeightOfBinaryTree heightOfBinaryTree;

    @BeforeEach
    void setUp() {
        heightOfBinaryTree = new HeightOfBinaryTree();
    }

    /**
     *        3
     *       / \
     *      /   \
     *     /     \
     *    /       \
     *    1       5
     *     \     / \
     *      \   /   \
     *      2   4   6
     *               \
     *               7
     */

    @Test
    void testCase1() {
        Node root = new Node(3);
        Node a = Node.insert(root, 1);
        Node.insert(a, 2);

        Node c = Node.insert(root, 5);
        Node.insert(c, 4);
        Node e = Node.insert(c, 6);
        Node.insert(e, 7);

        // Print the nodes
        TreePrinter.printNode(root);

        // Assert Height
        assertEquals(3, heightOfBinaryTree.height(root));
    }

    /**
     *    4
     *   / \
     *  /   \
     *  2   6
     * / \ / \
     * 1 3 5 7
     */
    @Test
    void testCase2() {
        Node root = new Node(4);
        Node a = Node.insert(root, 2);
        Node.insert(a, 1);
        Node.insert(a, 3);

        Node c = Node.insert(root, 6);
        Node.insert(c, 5);
        Node.insert(c, 7);

        // Print the nodes
        TreePrinter.printNode(root);

        // Assert Height
        assertEquals(2, heightOfBinaryTree.height(root));
    }
}
