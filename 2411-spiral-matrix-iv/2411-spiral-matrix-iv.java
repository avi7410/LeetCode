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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] arr = new int[m][n];
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        while(top <= bottom && left <= right){
        //top
        for(int i = left; i <= right; i++){
            if(head != null){
                arr[top][i] = head.val;
                head = head.next;
            }
            else{
                arr[top][i] = -1;
            }
            
        }
        top++;
        //right
        for(int i = top; i <= bottom; i++){
            if(head != null){
                arr[i][right] = head.val;
                head = head.next;
            }
            else{
                arr[i][right] = -1;
            }
            
        }
        right--;
        if(top <= bottom){
        //bottom
        for(int i = right; i >= left; i--){
            if(head != null){
                arr[bottom][i] = head.val;
                head = head.next;
            }
            else{
                arr[bottom][i] = -1;
            }
            
        }
        bottom--;
        }
        // if(top > bottom || left > right){
        //     break;
        // }
        if(left <= right){
        //left
        for(int i = bottom; i >= top; i--){
            if(head != null){
                arr[i][left] = head.val;
                head = head.next;
            }
            else{
                arr[i][left] = -1;
            }
            
        }
        left++;
        }
        }
        return arr;
    }
}