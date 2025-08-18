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
    static int seeTree(TreeNode p, TreeNode q){
        if(p==null && q==null) return 1;
        if(p==null || q==null)
        return 0;

        if(p.val!=q.val)
        return 0;

        int left = seeTree(p.left, q.left);
        int right = seeTree(p.right, q.right);
        return left & right;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
      int flag = seeTree(p, q);
      if(flag==1)return true;
      return false;
    
    }
}