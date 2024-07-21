class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        rev(s,i,j);
    }
    public void rev (char[]s, int i, int j){
        if(i>=j){
            return;
        }
        else{
            swap(s,i,j);
            rev(s,i+1,j-1);
        }
    }
    public void swap(char[]s, int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}