class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int s1 = word1.length();
        int s2 = word2.length();
        for(int i=0; i<Math.max(s1,s2); i++){
            if(i<s1){
                char ch1 = word1.charAt(i);
                ans.append(ch1);
            }
            if(i<s2){
                char ch2 = word2.charAt(i);
                ans.append(ch2);
            }
        }
        return ans.toString();
    }
}