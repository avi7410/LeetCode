class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] chArr = new int[26];
        for(char ch : s.toCharArray()){
            chArr[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            chArr[ch - 'a']--;
        }
        for(int i : chArr){
            if(i != 0) return false;
        }
        return true;
    }
}