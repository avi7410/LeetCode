class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == 0){
                helper(arr, i);
                arr[i] = 0;
                i++;
            }
        }
    }
    public void helper (int[] arr, int idx){
        for(int i = arr.length-2; i >= idx; i--){
            swap(arr, i, i+1);
        }
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}