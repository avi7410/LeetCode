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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode ptr = even;
        while(even != null && even.next != null){
            ListNode temp = even.next;
            odd.next = temp;
            odd = odd.next;
            even.next = temp.next;
            even = even.next;
        }
        odd.next = ptr;
        return head;
    }
}