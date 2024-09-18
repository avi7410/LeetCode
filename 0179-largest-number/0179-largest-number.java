class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i] + "";
        }
        int idx = 0;
        while(idx != nums.length - 1){
            boolean flag = true;
            for(int i = nums.length - 1; i > idx; i--){
                String s2 = arr[i] + arr[i-1];
                String s1 = arr[i-1] + arr[i];
                if(s2.compareTo(s1) > 0){
                    String temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
            idx++;
        }

        if (arr[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for(String s : arr){
            sb.append(s);
        }
        return sb.toString();
    }
}