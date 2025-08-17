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
    public List<List<Integer>> levelOrder(TreeNode root) {
      if(root==null)
      return new ArrayList<>();
      int level = 0;
      Queue<TreeNode> q = new LinkedList<>();
      List<List<Integer>> list = new ArrayList<>();
      q.offer(root);
      while(!q.isEmpty()){
        int len = q.size();
        list.add(new ArrayList<>());
        for(int i=0;i<len;i++){
            TreeNode curr = q.poll();
            list.get(level).add(curr.val);
            if(curr.left!=null)
            q.offer(curr.left);
            if(curr.right!=null)
            q.offer(curr.right);


        }
        level++;
      }

     return list;

    }
}