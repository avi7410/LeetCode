class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        for(int i = 0 ; i < arr.length; i++){
            arr[i]=reverse(arr[i]);
        }
        return String.join(" ",arr);
    }

    public String reverse(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}