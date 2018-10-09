class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode current=head;
        ListNode previous=null;
        while(current!=null) {
            if(previous!=null) {
                if(current.val==val) {
                    previous.next=current.next;
                    current=current.next;
                }
                else {
                    previous=current;
                    current=current.next;
                 }
            }
            else {
                if(current.val==val) {
                    head=current.next;
                    current=current.next;
                }
                else {
                    previous=current;
                    current=current.next;
                }
                
            }
          }
        return head;
    }
}