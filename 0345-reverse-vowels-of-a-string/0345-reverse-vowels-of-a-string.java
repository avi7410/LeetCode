class Solution {
    public String reverseVowels(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder vowel = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            ans.append(ch);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'|| ch == 'U' ){
                vowel.append(ch);
            }
        }
        vowel.reverse();
        int idx = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'|| ch == 'U' ){
                ans.setCharAt(i, vowel.charAt(idx));
                idx++;
            }
            
        }
        return ans.toString();
    }
}