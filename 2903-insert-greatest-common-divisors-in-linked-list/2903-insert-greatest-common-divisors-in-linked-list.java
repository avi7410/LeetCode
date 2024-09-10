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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode f = head;
        ListNode s = head.next;
        while(s != null){
            int hcf = gcd(f.val, s.val);
            insertNode(f,s,hcf);
            f = s;
            s = s.next;
        }
        return head;
    }
    private int gcd(int a, int b){
        if(a == 0) return b;
        return gcd(b%a, a);
    }
    private void insertNode(ListNode prev, ListNode post, int value){
        ListNode temp = new ListNode(value, post);
        prev.next = temp;
    }
}