/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode current=head;
        ListNode temp1=null,temp2=null,temp3=null,temp4=null;
        while(current!=null && current.next!=null) {
            temp1=null;
            temp2=null;
            temp3=null;
            if(temp4!=null) {
                temp1=current;
                while(temp1.next!=temp4) {
                    temp1=temp1.next;
               }
                if(temp4.next!=null) {
                    temp2=temp4.next.next;
                    temp1.next=temp4.next;
                }
                else {
                    temp1.next=temp4.next;
                    temp2=null;
                  }
                 temp3=current.next;
                 current.next=temp4;
                 temp4.next=temp3;
                 temp4=temp2;
            }
            else if(current==head){
            temp1=current.next;
            if(temp1.next!=null) {
                temp2=temp1.next;
                temp3=temp2.next;
                current.next=temp2;
                temp2.next=temp1;
                temp1.next=temp3;
                if(temp3!=null) {
                    temp4=temp3.next;
                }
            }
          }     
            current=current.next; 
        }
        return head;
    }
}