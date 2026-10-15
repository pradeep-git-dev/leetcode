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
    public int pairSum(ListNode head) {
        ListNode curr = head;
        List<Integer> ls = new ArrayList<>();
        while(curr != null){
            ls.add(curr.val);
            curr = curr.next;
        }
        int n = ls.size();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n /2; i++){
            max = Math.max(max , ls.get(i) + ls.get(n- i - 1));
        }

        return max;
        
    }
}