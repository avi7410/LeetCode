class Solution {
    public String kthDistinct(String[] arr, int k) {
        String s = "";
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            boolean distinct = true;
            for(int j = 0; j < arr.length; j++){
                if(i == j){
                    continue;
                }
                if(arr[i].equals(arr[j]) ){
                    distinct = false;
                    break;
                }
            }
            if(distinct){
                count++;
            }
            if( count == k ){
                return arr[i];
            }
        }
        return (count == arr.length) ? (arr[0]) : ("");
    }
}