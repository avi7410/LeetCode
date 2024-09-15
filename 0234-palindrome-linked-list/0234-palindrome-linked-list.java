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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tail = reverseList(slow);
        while(tail != null){
            if(head.val != tail.val){
                return false;
            }
            head = head.next;
            tail = tail.next;
        }
        return true;
    }
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