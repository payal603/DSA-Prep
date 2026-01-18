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
    TreeNode prev, first, mid, last;
    private void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=null && prev.val>root.val){
            if(first==null){
                first=prev;
                mid=root;
            }
            else{
                last=root;
            }
        }
        prev=root;
        inorder(root.right);
    }
    public void recoverTree(TreeNode root) {
        inorder(root);
        if(first!=null && last!=null){
            int t=first.val;
            first.val=last.val;
            last.val=t;

        }
        else{
            int t=first.val;
            first.val=mid.val;
            mid.val=t;

        }
        
    }
}
