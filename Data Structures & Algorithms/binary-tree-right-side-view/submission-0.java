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
    static List<Integer> traverse(TreeNode root , List<Integer> res,int level){
        if(root == null)
            return res;
        if(level == res.size())
            res.add(root.val);
        traverse(root.right,res,level+1);
        traverse(root.left,res,level+1);
        return res;
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return traverse(root,list,0);
    }
}
