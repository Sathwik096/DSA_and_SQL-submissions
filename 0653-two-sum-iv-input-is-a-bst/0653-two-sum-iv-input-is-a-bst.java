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
    static void BSTIteratorLeft(TreeNode root,Stack<TreeNode> st){
        while(root != null){
            st.add(root);
            root = root.left;
        }
    }
    static void BSTIteratorRight(TreeNode root,Stack<TreeNode> st){
        while(root != null){
            st.add(root);
            root = root.right;
        }
    }
    static void rightNext(Stack<TreeNode> st){
        if(st.peek().left!=null){
            TreeNode node = st.pop().left;
            while(node!=null){
                st.add(node);
                node=node.right;
            }
        }
        else
            st.pop();
    }
    static void leftNext(Stack<TreeNode> st){
        if(st.peek().right!=null){
            TreeNode node = st.pop().right;
            while(node!=null){
                st.add(node);
                node=node.left;
            }
        }
        else
            st.pop();
    }
    public boolean findTarget(TreeNode root, int k) {
        Stack<TreeNode> left = new Stack<>();
        Stack<TreeNode> right = new Stack<>();
        BSTIteratorLeft(root,left);
        BSTIteratorRight(root,right);
        while(left.size()>0 && right.size()>0){
            int l = left.peek().val  , r = right.peek().val;
            System.out.println(l+" "+r);
            if(l+r == k && l!=r)
                return true;
            else if(l+r > k){
                rightNext(right);
            }
            else
                leftNext(left);
        }
        return false;
    }
}