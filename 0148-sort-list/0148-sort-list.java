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
    public ListNode sortList(ListNode head) {
        List<Integer> ls = new ArrayList<Integer>();
        ListNode temp = head;
        while(temp != null){
            ls.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(ls);
        int idx = 0;
        temp = head;
        while(temp != null){
            temp.val = ls.get(idx++);
            temp = temp.next;
        }
        return head;
    }
}