package com.example.project;

public class TreeUser {
    public static <T> int countLeaves(BT<T> bt) {
        bt.find(Relative.Root);

        return countLeavesHelper(bt.root);
    }

    private static <T> int countLeavesHelper(BTNode<T> node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeavesHelper(node.left) + countLeavesHelper(node.right);
    }
}
