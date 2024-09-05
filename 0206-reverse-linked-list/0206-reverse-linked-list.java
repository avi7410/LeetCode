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
    public ListNode reverseList(ListNode head) {
        if(head == null ||  head.next == null){
            return head;
        }
        ListNode b = head;
        ListNode a = null;
        do{
            ListNode temp = b.next;
            b.next = a;
            a = b;
            b = temp;
        }while(b != null);
        return a;
    }
}