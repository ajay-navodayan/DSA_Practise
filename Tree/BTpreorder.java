import java.util.*;

public class BTpreorder {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> Arlist = new ArrayList<>();
        helper(root, Arlist);
        return Arlist;
    }

    public static void helper(TreeNode root, ArrayList<Integer> Arlist) {
        if (root == null) {
            return;
        }
        Arlist.add(root.val);
        helper(root.left, Arlist);
        helper(root.right, Arlist);
    }

    public static void main(String[] args) {
        BTpreorder obj = new BTpreorder();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(obj.preorderTraversal(root));
    }
}

