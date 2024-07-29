class Solution {
    public String reverseVowels(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            ans.append(s.charAt(i));
        }
        int l = 0;
        int r = s.length()-1;
        while(l < r){
            if(! (isVowel(s.charAt(l)))){
                l++;
            }
            if(! (isVowel(s.charAt(r)))){
                r--;
            }
            if((isVowel(s.charAt(r))) && (isVowel(s.charAt(l)))){
                swapVowel(ans, r, l);
                l++;
                r--;
            }
        }
        return ans.toString();
    }
    public boolean isVowel(char ch ){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
    public void swapVowel(StringBuilder sb, int a, int b){
        char temp = sb.charAt(a);
        sb.setCharAt(a, sb.charAt(b));
        sb.setCharAt(b, temp);
    }
}