/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow == head){
            return null;
        }else if(slow.next == null){
            head.next = null;
            return head;
        }

       ListNode temp = head;
       while(temp.next != slow && temp!= null){
        temp = temp.next;
       }
       temp.next = temp.next.next;
       return head;
    }
}