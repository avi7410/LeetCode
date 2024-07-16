class Solution {
    public String toLowerCase(String s) {
        //97 - 122 small
        //65 - 90 capital
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            int temp = s.charAt(i);
            if(temp<=90 && temp>=65){
                ans.append((char)(temp+32));
            }
            else{
                ans.append((char)temp);
            }
        }
        return ans.toString();
    }
}