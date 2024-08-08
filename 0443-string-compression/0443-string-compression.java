class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int res = 0;
        int idx = 0;
        int count = 0;
        char ch = chars[idx];
        while(idx < chars.length){
             if(ch == chars[idx]){
                idx++;
                count++;
             }
             else{
                sb.append(ch);
                helper(count, sb);
                ch = chars[idx];
                idx++;
                count = 1;
             }
        }
        sb.append(ch);
        helper(count, sb);
        for(int i = 0; i < sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
    private void helper(int count, StringBuilder sb){
        if(count <= 1){
            return;
        }
        else if(count <= 10){
            sb.append(count);
            return; 
        }
        else{
            sb.append(count);
            return;
        }
    }
}