class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] temp = new int[1001];
        for(int i = 0; i < arr.length; i++){
            temp[target[i]] += 1;
        }
        for(int i = 0; i < arr.length; i++){
            temp[arr[i]] -= 1;
            if(temp[arr[i]] < 0){
                return false;
            }
        }
        return true;
    }
}