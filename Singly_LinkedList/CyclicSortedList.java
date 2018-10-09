/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val,Node _next) {
        val = _val;
        next = _next;
    }
};
*/
class Solution {
    public Node insert(Node head, int insertVal) {
        Node newNode=new Node(insertVal,null);
        newNode.next=newNode;
        if(head==null) {
            return newNode;
        }
        Node current=head;
        while(current!=null) {
            if((newNode.val >= current.val) && (newNode.val <= current.next.val)) {
                    Node temp=current.next;
                    current.next=newNode;
                    newNode.next=temp;
                    return head;
                }
             else if(current.next.next==head) {
                 
                 if((newNode.val <= current.next.val && newNode.val <= head.val)) {
                     if(current.next.val < head.val) {
                          Node temp=current.next;
                          current.next=newNode;
                          newNode.next=temp;
                          return head;
                     }
                     else if(current.next.val >= head.val) {
                          Node temp=current.next.next;
                          current.next.next=newNode;
                          newNode.next=temp;
                          return head;
                     }
                 }
                 if((newNode.val >= current.next.val) &&  (newNode.val >= head.val)) {
                         if(current.next.val < head.val) {
                          Node temp=current.next;
                          current.next=newNode;
                          newNode.next=temp;
                          return head;
                     }
                     else if(current.next.val >= head.val) {
                          Node temp=current.next.next;
                          current.next.next=newNode;
                          newNode.next=temp;
                          return head;
                     }
                 }
                  if((newNode.val >= current.next.val && newNode.val <= head.val)){
                          Node temp=current.next.next;
                          current.next.next=newNode;
                          newNode.next=temp;
                          return head;
                         
                     }
                }
              else if(current.next==head) {
                         
                          Node temp=current.next;
                          current.next=newNode;
                          newNode.next=temp;
                          return head;
                } 
            else if((newNode.val <= current.val) && (newNode.val <= current.next.val)) {
                if(current.next.val < current.next.next.val) {
                          Node temp=current.next;
                          current.next=newNode;
                          newNode.next=temp;
                          return head;
                }
                
            }
            current=current.next;
        }
        return head;
    }
  }
    