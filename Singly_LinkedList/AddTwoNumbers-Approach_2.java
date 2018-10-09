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
             while(l1!=null || l2!=null) {
                 int x=(l1!=null) ? l1.val:0;
                 int y=(l2!=null) ? l2.val:0;
                 sum=(x+y+carry);
                 if(l1!=null) {
                     l1.val=(sum % 10);
                     prev=l1;
                 }
                 else {
                     l2.val=(sum%10);
                     prev.next=l2;
                     prev=l2;
                 } 
                 carry=(sum/10);
                 l1=(l1!=null)?l1.next:null;
                 l2=(l2!=null)?l2.next:null;
             }
              if(carry!=0) {
                    ListNode temp=new ListNode(carry);
                    prev.next=temp;
               }   
                return prehead.next;
            }
            
        }    
    }
