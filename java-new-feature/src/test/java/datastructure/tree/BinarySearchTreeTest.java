package datastructure.tree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @auther guan.c.wang
 * @date 2/7/2020.
 * @see
 */
public class BinarySearchTreeTest {

    @Test
    public void add() throws Exception {
        MyNode node1 = new MyNode(10);
        BinarySearchTree binarySearchTree = new BinarySearchTree(node1);
        MyNode node2 = new MyNode(20);
        MyNode node3 = new MyNode(30);
        MyNode node4 = new MyNode(40);
        MyNode node5 = new MyNode(9);
        MyNode node6 = new MyNode(1);
        MyNode node7 = new MyNode(5);

        binarySearchTree.add(node2);
        binarySearchTree.add(node3);
        binarySearchTree.add(node4);
        binarySearchTree.add(node5);
        binarySearchTree.add(node6);
        binarySearchTree.add(node7);
        binarySearchTree.preorder();
        System.out.println("前序");
        binarySearchTree.middleOrder();
        System.out.println("中序");
        binarySearchTree.afterOrder();
        System.out.println("后序");

    }
}