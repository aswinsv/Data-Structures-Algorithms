/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1!=null && l2==null) {
            return l1;
        }
        else if(l1==null && l2!=null) {
            return l2;
        }
        else {
        ListNode head=null;
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode temp3=null;
        ListNode temp;    
        while(temp1!=null && temp2!=null) {
            if(temp1.val < temp2.val) {
                temp=new ListNode(temp1.val);
                if(head==null) {
                   head=temp;
                   temp3=head; 
                }
                else {
                   temp3.next=temp;
                   temp3=temp; 
                }
                temp1=temp1.next;
            }
            else if(temp2.val < temp1.val) {
                temp=new ListNode(temp2.val);
                if(head==null) {
                   head=temp;
                   temp3=head; 
                }
                else {
                   temp3.next=temp;
                   temp3=temp; 
                }
                temp2=temp2.next;
            }
            else {
                temp=new ListNode(temp2.val);
                if(head==null) {
                   head=temp;
                   temp3=head; 
                }
                else {
                   temp3.next=temp;
                   temp3=temp; 
                }
                temp2=temp2.next;
                temp=new ListNode(temp1.val);
                temp3.next=temp;
                temp3=temp; 
                temp1=temp1.next;
            }
        }
       if(temp1!=null && temp2==null) {
           while(temp1!=null) {
               temp=new ListNode(temp1.val);
               if(head==null) {
                 head=temp;
                 temp3=head;    
               }
               else {
               temp3.next=temp;
               temp3=temp;
               }
              temp1=temp1.next;
           }
       }
    else if(temp1==null && temp2!=null) {
           while(temp2!=null) {
               temp=new ListNode(temp2.val);
                if(head==null) {
                 head=temp;
                 temp3=head;    
               }
               else {
                temp3.next=temp;
                temp3=temp;
               }    
               temp2=temp2.next;
           }
       }
       return head; 
     }      
    }
}