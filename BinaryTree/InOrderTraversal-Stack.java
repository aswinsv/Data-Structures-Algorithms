/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> res=new ArrayList<Integer>();
      Stack<TreeNode> st=new Stack<TreeNode>();
      TreeNode curr=root;
      while(curr!=null || !st.empty()) {
          while(curr!=null) {
              st.push(curr);
              curr=curr.left;
          
          }
          curr=st.pop();
          res.add(curr.val);
          curr=curr.right;
      } 
      return res;  
    }
} 
