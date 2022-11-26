package com.bridgelabz;

public class MainBST {

    public static void main(String[] args) {

        System.out.println("Welcome to Binary Search Tree Program");
        BinaryTree bst = new BinaryTree();
        Node root = null;
        root = bst.insert(root, 56);
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);
        bst.print(root);
    }
}
