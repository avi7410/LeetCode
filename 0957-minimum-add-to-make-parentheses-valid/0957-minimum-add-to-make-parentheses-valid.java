class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();
        int idx = 0;
        int miss = 0;
        while(idx < s.length()){
            char ch = s.charAt(idx);
            if(ch == '('){
                miss++;
                stk.push(')');
            }
            else if(stk.empty()){
                miss++;
            }
            else{
                stk.pop();
                miss--;
            }
            idx++;
        }
        return miss;
    }
}