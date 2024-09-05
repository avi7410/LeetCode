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
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;
        while(temp != null){
            sb.append(temp.val);
            temp = temp.next;
        }
        return palindromeCheck(sb);
    }
    private boolean palindromeCheck(StringBuilder str){
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i++) != str.charAt(j--)) return false;
        }
        return true;
    }
}