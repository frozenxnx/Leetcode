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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         Queue<TreeNode> q = new LinkedList<>();
     List<List<Integer>> wrap = new ArrayList<>();
     if(root == null)return wrap;

     q.offer(root);
     while(!q.isEmpty()){
        int level = q.size();
        List<Integer> sub = new ArrayList<>();
        for(int i=0;i<level;i++){
            TreeNode node = q.poll();
            sub.add(node.val);
            if(node.left!=null){
                q.add(node.left);
            }
            if(node.right!=null){
                q.add(node.right);
            }          
        }
        wrap.add(sub);
     } 
     Collections.reverse(wrap);
     return wrap;
    }
}