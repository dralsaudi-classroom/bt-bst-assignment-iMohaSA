package com.example.project;

public class TreeUser {
    public static <T> int countLeaves(BT<T> bt) {
        return countLeavesHelper(bt.getRoot());
    }

    private static <T> int countLeavesHelper(Node<T> node) {
        if (node == null) {
            return 0;
        }
        if (node.isLeaf()) {
            return 1;
        }
        return countLeavesHelper(node.left) + countLeavesHelper(node.right);
    }
}
