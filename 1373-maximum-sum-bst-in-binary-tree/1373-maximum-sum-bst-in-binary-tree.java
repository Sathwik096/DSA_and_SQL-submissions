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
 class pair{
        public int sum , min , max;
        public pair(int sum,int min,int max){
            this.sum = sum;
            this.min = min;
            this.max = max;
        }
    }
class Solution {
    static int[] a = new int[1];
    static pair maxSum(TreeNode root){
        if(root == null)
            return new pair(0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        pair left = maxSum(root.left);
        pair right = maxSum(root.right);
        if(left.max < root.val && right.min > root.val ){
            a[0] = Math.max(a[0],left.sum+right.sum+root.val);
            return new pair(left.sum+right.sum+root.val , Math.min(left.min,root.val) , Math.max(right.max,root.val));
        }
        return new pair(Math.max(left.sum,right.sum),Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public int maxSumBST(TreeNode root) {
        a[0] = 0;
        maxSum(root);
        return a[0];
    }
}