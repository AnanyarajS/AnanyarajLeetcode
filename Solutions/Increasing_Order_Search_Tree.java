// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public TreeNode increasingBST(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         inorder(root, list);
//         int i=1;
//         TreeNode node = new TreeNode(list.get(0));
//         TreeNode curr = node;
//         while(i<list.size()){
//             curr.right = new TreeNode(list.get(i));
//             curr = curr.right;
//             i++;
//         }
//         return node;
        
//     }
//     static void inorder(TreeNode root, List<Integer> list){
//         if(root==null) return;
//         inorder(root.left, list);
//         list.add(root.val);
//         inorder(root.right, list);        
//     }

// }
class Solution{
    private static TreeNode curr = null;;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(0);
        curr = dummy;
        inorder(root);
        return dummy.right;
    
    }
    static void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        root.left = null;
        curr.right = root;
        curr = root;
        inorder(root.right); 

    }
}