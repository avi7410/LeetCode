class Solution {
    public String restoreString(String s, int[] indices) {
        int size= indices.length;
        char[] str = new char[size];
        for(int i=0; i<size; i++){
            str[indices[i]]=s.charAt(i);
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<size; i++){
            ans.append(str[i]);
        }
        return ans.toString();
    }
}