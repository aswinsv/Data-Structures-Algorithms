/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int findLength(ListNode head) {
        ListNode temp=head;
        int length=0;
        while(temp!=null) {
            temp=temp.next;
            length++;
        }
        return length;
    }
    public boolean isPalindrome(ListNode head) {
        int length=findLength(head); 
        if(length <=1) {
            return true;
        }
        else if(length==2) {
            if(head.val==head.next.val) {
                return true;
            }
            else {
                return false;
            }
        }
        else if(length==3) {
            if(head.val==head.next.next.val) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
         ListNode temp=head;
            Stack st=new Stack();
            int startIndex=1;
            int midIndex=0;
            int traversalIndex=1;
            if(length%2==0) {
               midIndex=(length/2);
            }
            else {
                midIndex=((length-1)/2+1);
            }
            while(traversalIndex <= length && temp!=null) {
                if(traversalIndex<=midIndex) {
                    traversalIndex++;
                    temp=temp.next;
                    continue;
                }
                else {
                   st.push(temp.val);
                   temp=temp.next;
                   traversalIndex++; 
                }
            }
            traversalIndex=1;
            int val=0;
            temp=head;
            while(traversalIndex<=midIndex && temp!=null && !st.empty()) {
                val=(int)st.pop();
                if(temp.val==val) {
                    traversalIndex++;
                    temp=temp.next;
                }
                else {
                    return false;
                }
            }
               return true;
          }       
        
    }
}

# Solution 2

    Stack st=new Stack();
                ListNode temp=head;
                while(temp!=null) {
                       st.push(temp.val);
                       temp=temp.next;
                }
                int val=0;
                temp=head;
                while(temp!=null && !st.empty()) {
                    val=(int)st.pop();
                    if(temp.val==val) {
                      temp=temp.next;
                    }
                    else {
                        return false;
                    }
                }
                   return true;


#Solution 3

 /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        ListNode prev_slowptr=null;
        ListNode slow_ptr=null;
        ListNode fast_ptr=null;
        ListNode second_half=null;
        ListNode first_half=null;
        public ListNode findMiddle(ListNode head) {
             slow_ptr=head;
             fast_ptr=head;
            while(fast_ptr!=null && fast_ptr.next!=null) {
                prev_slowptr=slow_ptr;
                slow_ptr=slow_ptr.next;
                fast_ptr=fast_ptr.next.next;
            }
            return slow_ptr;
        }
        public boolean isPalindrome(ListNode head) {
            if(head==null || head.next==null) {
                return true;
            }
            else {
               first_half=head; 
               second_half=findMiddle(head);  
               if(fast_ptr!=null) {
                   second_half=slow_ptr.next;
               } 
               if(second_half.next==null) {
                   if(first_half.val==second_half.val) {
                       return true;
                   }
                   else {
                       return false;
                   }
               }
               else {
                   second_half=reverseList(second_half);
                   return compareLists(first_half,second_half);
               }
            }   
           
         }
        public ListNode reverseList(ListNode head) {
            ListNode temp=head;
            ListNode prev=null,next=null;
            while(temp!=null) {
                next=temp.next;
                temp.next=prev;
                prev=temp;
                temp=next;
            }
            return prev;
        }
        public boolean compareLists(ListNode first,ListNode second) {
            while(first!=null && second!=null) {
                if(first.val==second.val) {
                    first=first.next;
                    second=second.next;
                }
                else {
                    return false;
                }
            }
            return true;
        }
    }                   