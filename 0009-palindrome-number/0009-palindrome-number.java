class Solution {
    public boolean isPalindrome(int x) {
        int reverseX = 0;
        int originalX = x;
        while(x > 0){
            reverseX = (reverseX * 10) + (x % 10);
            x /= 10;
        }
        return originalX == reverseX;
    }
}