class Solution {
    public boolean isSubsequence(String s, String t) {
        int idx = 0;
        for(int i = 0; i < s.length(); i++){
            int x = helper(s.charAt(i), idx, t);
            if(x == -1){
                return false;
            }
            else{
                idx = x;
            }
        }
        return true;
    }
    public int helper (char ch, int s, String t){
        for(int i = s; i < t.length(); i++){
            if(ch == t.charAt(i)){
                return ++i;
            }
        }
        return -1;
    }
}