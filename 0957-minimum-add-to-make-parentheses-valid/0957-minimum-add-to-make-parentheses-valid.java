class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();
        int idx = 0;
        int miss = 0;
        while(idx < s.length()){
            char ch = s.charAt(idx);
            if(ch == '('){
                stk.push(')');
            }
            else if(stk.empty()){
                miss++;
            }
            else{
                stk.pop();
            }
            idx++;
        }
        while(!stk.empty()){
            stk.pop();
            miss++;
        }
        return miss;
    }
}