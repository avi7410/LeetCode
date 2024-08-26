class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int minLen = Integer.MAX_VALUE;
        for(String str : strs){
            minLen = Math.min(minLen, str.length());
        }
        for(int i = 0; i < minLen; i++){
            char ch = strs[0].charAt(i);
            boolean flag = true;
            for(String str : strs){
                if(ch != str.charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                sb.append(ch);
            }
            else{
                break;
            }
        }
        return (sb.length() > 0) ? (sb.toString()) : ("");
    }
}