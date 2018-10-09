/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode firstPointer=head;
        int length=getLength(firstPointer);
        int diff=length-n;
        if(diff > 0) {
            for(int i=0;i<diff-1;i++) {
                if(firstPointer!=null) {
                    firstPointer=firstPointer.next;
                }
            }
            if(firstPointer!=null && firstPointer.next!=null) {
               firstPointer.next=firstPointer.next.next;
             } 
            return head;
        }
        else {
            firstPointer=firstPointer.next;
            return firstPointer;
        }
        
    }
    public int getLength(ListNode firstPointer) {
        int length=0;
        while(firstPointer!=null) {
            length++;
            firstPointer=firstPointer.next;
        }
        return length;
    }
}