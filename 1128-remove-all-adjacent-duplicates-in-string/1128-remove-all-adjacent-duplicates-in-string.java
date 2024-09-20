class Solution {
    public String removeDuplicates(String s) {
        int i = 0;
        Stack<Character> stk = new Stack<>();
        while(i < s.length()){
            char ch = s.charAt(i);
            if((!(stk.empty())) && stk.peek() == ch){
                stk.pop();
            }
            else{
                stk.push(ch);
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.empty()){
            sb.append(stk.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}