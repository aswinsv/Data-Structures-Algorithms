class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pointer1=head;
        ListNode pointer2=null;
        ListNode temp=null;
        while(pointer1!=null) {
            temp=pointer1.next;
            pointer1.next=pointer2;
            pointer2=pointer1;
            pointer1=temp;
        }
        return pointer2;
     } 
        

}