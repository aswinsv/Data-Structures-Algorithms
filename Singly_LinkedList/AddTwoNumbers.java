/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1!=null && l2==null) {
            return l1;
        }
        else if(l1==null && l2!=null) {
            return l2;
        }
        else {
            int val=0,carry=0,sum=0;
            ListNode prehead=new ListNode(-1);
            prehead.next=l1;
            ListNode prev=null;
             while(l1!=null && l2!=null) {
                 sum=(l1.val + l2.val+carry);
                 val=(sum % 10);
                 carry=(sum/10);
                 l1.val=val;
                 prev=l1;
                 l1=l1.next;
                 l2=l2.next;
             }
            if(l1==null && l2!=null) {
                prev.next=l2;
                while(l2!=null && carry!=0) {
                 sum=(l2.val+carry);
                 val=(sum % 10);
                 carry=(sum/10);
                 l2.val=val;
                 prev=l2;   
                 l2=l2.next; 
                }
                if(carry!=0) {
                    ListNode temp=new ListNode(carry);
                    prev.next=temp;
                }
            }
            else if(l1!=null && l2==null) {
                while(l1!=null && carry!=0) {
                 sum=(l1.val+carry);
                 val=(sum % 10);
                 carry=(sum/10);
                 l1.val=val;
                 prev=l1;   
                 l1=l1.next; 
                }
                if(carry!=0) {
                    ListNode temp=new ListNode(carry);
                    prev.next=temp;
                }
            }
            else {
               if(carry!=0) {
                    ListNode temp=new ListNode(carry);
                    prev.next=temp;
               }   
            }
            return prehead.next;
        }
        
    }
}