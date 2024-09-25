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
    // 1 , 2, 3, 4, 5, 6
    public int pairSum(ListNode head) {
        int len = 0;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            len++;
        }
        ListNode temp1 = null;
        ListNode temp2 = null;
        while(slow != null){
            temp2 = slow.next;
            slow.next = temp1;
            temp1 = slow;
            slow = temp2;
        }
        int max = 0;
        while(len != 0){
            int val = head.val + temp1.val;
            head = head.next;
            temp1 = temp1.next;
            len--;
            max = Math.max(max, val);
        }
        return max;
    }
}