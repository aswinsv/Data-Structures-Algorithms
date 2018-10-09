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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> nodes=new ArrayList<Integer>();
        Stack<TreeNode> st=new Stack<TreeNode>();
        if(root!=null) {
            nodes.add(root.val);
            if(root.right!=null) {
             st.push(root.right);
             }
            if(root.left!=null) {
            st.push(root.left);
            }
            while(!st.empty()) {
            TreeNode node=st.peek();
             nodes.add(node.val); 
             st.pop(); 
                if(node.right!=null) {
                 st.push(node.right);
                }
                if(node.left!=null) {
                 st.push(node.left);
                } 
            }
        }     
        return nodes;
    }
}