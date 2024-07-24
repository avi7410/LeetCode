class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0;
        int idx = 0;
        StringBuilder ans = new StringBuilder();
        while(idx<s.length()){
            if(s.charAt(idx) == ' '){
                count++;
                if(count == k ){
                    return ans.toString();
                }
                ans.append(s.charAt(idx));
                idx++;
            }
            else{
                ans.append(s.charAt(idx));
                idx++;
            }
        }
        return ans.toString();
    }
}