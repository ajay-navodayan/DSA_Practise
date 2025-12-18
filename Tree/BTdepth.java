import java.util.*;

public class BTdepth {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        int height = Math.max(lh, rh) + 1;
        return height;
    }

    public static void main(String[] args) {
        BTdepth obj = new BTdepth();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        System.out.println(obj.maxDepth(root));
    }
}
