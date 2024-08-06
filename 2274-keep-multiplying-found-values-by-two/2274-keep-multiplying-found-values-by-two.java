class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(true){
            if(helper(nums, original)){
                original *= 2;
            }
            else{
                break;
            }
        }
        return original;
    }
    private boolean helper(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }
}