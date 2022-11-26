package com.bridgelabz;

public class BinaryTree {

    public Node insert(Node root, int value) {

        if (root == null) {
            return createNewNode(value);
        }

        /*
         * If value less than root data then it will print on left side
         */
        if (root.data > value) {
            root.left = insert(root.left, value);
            /*
             * If value is greater than root data then it will print on right side
             */
        } else if (root.data < value) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public Node createNewNode(int a) {
        Node bst = new Node();
        bst.data = a;
        bst.left = null;
        bst.right = null;
        return bst;
    }

    public void print(Node root) {

        if (root == null) {
            return;
        }
        print(root.left);
        System.out.println(root.data);
        print(root.right);
    }
}
