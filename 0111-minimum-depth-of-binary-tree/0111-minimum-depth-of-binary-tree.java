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
    public int minDepth(TreeNode root) {
        return bfs(root);
    }

    private int bfs(TreeNode root){
        if(root == null){
            return 0;
        }
       Queue<Pair<TreeNode,Integer>> q = new LinkedList<>();
       q.add(new Pair<>(root,1));
       while(!q.isEmpty()){
         Pair<TreeNode,Integer> p = q.poll();
         TreeNode node = p.getKey();
         int depth = p.getValue();

         if(node.left==null && node.right==null){
            return depth;
         } 

         if(node.left!=null)q.add(new Pair<>(node.left,depth+1));
         if(node.right!=null)q.add(new Pair<>(node.right,depth+1));

       }
       return 0;
    }
}