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
    static TreeNode first , middle ,last , prev;
    static void inorder(TreeNode root){
        if(root == null)
            return ;
        inorder(root.left);
        if(prev!=null && prev.val > root.val){
            if(first == null){
                first = prev;
                middle = root;
            }
            else
                last = root;
        }
        prev = root;
        inorder(root.right);
    }
    public void recoverTree(TreeNode root) {
        prev = first = middle = last = null ;
        inorder(root);
        if(last == null)
            swap(first,middle);
        else{
            swap(first,last);
        }
    }
    static void swap(TreeNode a , TreeNode b){
        int data = a.val;
        a.val = b.val;
        b.val = data;
    }
}