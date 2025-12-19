import java.util.*;

public class ConstructBTPreIn {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    int preIndex = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(preorder, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIndex++]);
        int idx = map.get(root.val);

        root.left = helper(preorder, inStart, idx - 1);
        root.right = helper(preorder, idx + 1, inEnd);

        return root;
    }

    public static void main(String[] args) {
        ConstructBTPreIn obj = new ConstructBTPreIn();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = obj.buildTree(preorder, inorder);
        System.out.println(root.val);
    }
}

