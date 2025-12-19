import java.util.*;

public class BST_ceil {

    static class TreeNode<T> {
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) {
            this.data = data;
        }
    }

    public static int findCeil(TreeNode<Integer> root, int key) {
        int ceil = -1;
        while (root != null) {
            if (root.data == key) {
                return root.data;
            }
            if (key > root.data) {
                root = root.right;
            } else {
                ceil = root.data;
                root = root.left;
            }
        }
        return ceil;
    }

    public static int findFloor(TreeNode<Integer> root, int key) {
        int floor = -1;
        while (root != null) {
            if (root.data == key) {
                return root.data;
            }
            if (key < root.data) {
                root = root.left;
            } else {
                floor = root.data;
                root = root.right;
            }
        }
        return floor;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(8);
        root.left = new TreeNode<>(4);
        root.right = new TreeNode<>(12);
        root.left.left = new TreeNode<>(2);
        root.left.right = new TreeNode<>(6);
        root.right.left = new TreeNode<>(10);
        root.right.right = new TreeNode<>(14);

        System.out.println(findCeil(root, 5));
        System.out.println(findFloor(root, 5));
    }
}
