/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        int diff = targetSum - root.val;
        if(root.left == null && root.right == null){
            return diff == 0;
        }
        boolean left = hasPathSum(root.left, diff);
        boolean right = hasPathSum(root.right, diff);
        return left || right;
    }
}