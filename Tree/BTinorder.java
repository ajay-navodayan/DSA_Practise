import java.util.*;

public class BTinorder {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ar = new ArrayList<>();
        helper(root, ar);
        return ar;
    }

    private static void helper(TreeNode root, ArrayList<Integer> ar) {
        if (root == null) {
            return;
        }
        helper(root.left, ar);
        ar.add(root.val);
        helper(root.right, ar);
    }

    public static void main(String[] args) {
        BTinorder obj = new BTinorder();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(obj.inorderTraversal(root));
    }
}
