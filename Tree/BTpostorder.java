import java.util.*;

public class BTpostorder {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public void helper(TreeNode root, ArrayList<Integer> ar) {
        if (root == null) {
            return;
        }
        helper(root.left, ar);
        helper(root.right, ar);
        ar.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ar = new ArrayList<>();
        helper(root, ar);
        return ar;
    }

    public static void main(String[] args) {
        BTpostorder obj = new BTpostorder();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(obj.postorderTraversal(root));
    }
}
