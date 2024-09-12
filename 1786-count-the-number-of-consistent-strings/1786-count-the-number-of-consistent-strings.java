class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] charArr = new int[26];
        for(int i = 0; i < allowed.length(); i++){
            int idx = allowed.charAt(i) - 'a';
            charArr[idx] = 1;
        }
        int count = 0;
        for(String str : words){
            count += isConsistent(charArr, str);
        }
        return count;
    }
    private int isConsistent(int[] arr, String str){
        for(int i = 0; i < str.length(); i++){
            int idx = str.charAt(i) - 'a';
            if(arr[idx] == 0) return 0;
        }
        return 1;
    }
}