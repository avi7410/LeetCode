class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0, idx = 0;

        while(idx < s.length() && count<k){
            if(s.charAt(idx++) == ' '){
                count++;
            }
        }

        return s.substring(0, idx == s.length() ? idx : idx -1);
    }
}