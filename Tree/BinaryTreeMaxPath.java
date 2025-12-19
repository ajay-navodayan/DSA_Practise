import java.util.*;

public class BinaryTreeMaxPath {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxSum;
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));

        maxSum = Math.max(maxSum, root.val + left + right);

        return root.val + Math.max(left, right);
    }

    public static void main(String[] args) {
        BinaryTreeMaxPath obj = new BinaryTreeMaxPath();

        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(obj.maxPathSum(root));
    }
}

