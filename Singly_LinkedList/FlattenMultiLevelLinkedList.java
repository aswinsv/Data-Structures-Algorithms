/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
};
*/
class Solution {
    public Node flatten(Node head) {
        Node temp=head;
        while(temp!=null) {
            if(temp.child!=null) {
                traverseChildNode(temp,temp.child,temp.next);
                temp.child=null;
            }
            temp=temp.next;
        }
        return head;
     }
    public void traverseChildNode(Node prev,Node child,Node next) {
        prev.next=child;
        child.prev=prev;
        Node temp1=child;
        Node temp2=null;
        while(temp1!=null) {
            if(temp1.child!=null) {
                traverseChildNode(temp1,temp1.child,temp1.next);
                temp1.child=null;
            }
            temp2=temp1;
            temp1=temp1.next;
        }
        temp2.next=next;
        if(next!=null) {
            next.prev=temp2;
        }   
        return;
    }
}