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
       Stack<TreeNode> stack=new Stack<TreeNode>();
       List<Integer> data=new ArrayList<>(); 
       if(root==null) {
           return data;
       } 
       if(root.left!=null) {
           stack.push(root.left);
       }
       while(!stack.empty()) {
           TreeNode node=stack.peek();
           if(node.left!=null) {
               stack.push(node.left);
           }
           else if(node.right!=null) {
               stack.pop();
               data.add(node.val);
               stack.push(node.right);
           }
           else if(node.left==null && node.right==null) {
                data.add(node.val);
                stack.pop();
                TreeNode tempNode=stack.peek();
                if(!stack.empty()) {
                    stack.pop();
                    data.add(tempNode.val); 
                    if(tempNode.right!=null){
                        stack.push(tempNode.right);
                    }
                 }    
              }
       } 
        data.add(root.val);
        if(root.right!=null) {
           stack.push(root.right);
       }
         while(!stack.empty()) {
           TreeNode node=stack.peek();
           if(node.left!=null) {
               stack.push(node.left);
           }
           else if(node.right!=null) {
               stack.pop();
               data.add(node.val);
               stack.push(node.right);
           }
           else if(node.left==null && node.right==null) {
                data.add(node.val);
                stack.pop();
                if(!stack.empty()) {
                    TreeNode tempNode=stack.peek();
                    stack.pop();
                    data.add(tempNode.val); 
                    if(tempNode.right!=null){
                      stack.push(tempNode.right);
                     }
                }     
           }
       } 
       
       }
        return data;
    }
