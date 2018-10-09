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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> elements=new ArrayList<List<Integer>>();
        if(root==null)
            return elements;
        Queue<TreeNode> nodes=new LinkedList<TreeNode>();
        nodes.add(root);
        TreeNode curr=null;
        List<Integer> currentRow=new ArrayList<Integer>();
        List<TreeNode> nextLevel=new ArrayList<TreeNode>();
        while(!nodes.isEmpty()) {
            curr=nodes.poll();
            currentRow.add(curr.val);
            if(curr.left!=null) {
               nextLevel.add(curr.left); 
            }
            if(curr.right!=null) {
               nextLevel.add(curr.right); 
            }
            if(nodes.isEmpty()) {
                List<Integer> newRow=new ArrayList<Integer>(currentRow);
                elements.add(newRow);
                currentRow.clear();
                nodes.addAll(nextLevel);
                nextLevel.clear();
            }
        }
            return elements;
    }
}