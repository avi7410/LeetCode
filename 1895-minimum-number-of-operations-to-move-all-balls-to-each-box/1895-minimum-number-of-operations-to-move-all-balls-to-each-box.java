class Solution {
    public int[] minOperations(String boxes) {
        int[] arr = new int[boxes.length()];
        for(int i = 0; i < boxes.length(); i++){
            arr[i] = Character.getNumericValue(boxes.charAt(i));
        }
        int[] ans = new int[arr.length];
        System.out.println(Arrays.toString(ans));
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i==j || arr[j] == 0){
                    continue;
                }
                ans[i] += Math.abs(i-j);
            }
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}