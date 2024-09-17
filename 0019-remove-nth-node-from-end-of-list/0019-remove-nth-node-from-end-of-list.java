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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 1;
        ListNode temp = head;
        while(temp != null && temp.next != null){
            len++;
            temp = temp.next;
        }
        len = len - n;
        if(len == 0){
            head = head.next;
            return head;
        }
        temp = head;
        while(len != 1){
            len--;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}