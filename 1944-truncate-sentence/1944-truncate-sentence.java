class Solution {
    public String truncateSentence(String s, int k) {
        // Beats 75.91%
        // int count = 0;
        // int idx = 0;
        // StringBuilder ans = new StringBuilder();
        // while(idx<s.length()){
        //     if(s.charAt(idx) == ' '){
        //         count++;
        //         if(count == k ){
        //             return ans.toString();
        //         }
        //         ans.append(s.charAt(idx));
        //         idx++;
        //     }
        //     else{
        //         ans.append(s.charAt(idx));
        //         idx++;
        //     }
        // }
        // return ans.toString();

        String[] arr = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < k; i++){
            ans.append(arr[i]);
            if(i==k-1){
                break;
            }
            ans.append(" ");
        }
        return ans.toString();
    }
}