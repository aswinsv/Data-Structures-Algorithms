/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> nodeList=new HashSet<ListNode>();
        ListNode temp=head;
        while(temp!=null) {
            if(nodeList.contains(temp)) {
                return temp;
            }
            else {
                nodeList.add(temp);
                temp=temp.next;
            }
        }
        return null;
    }
        
    }
