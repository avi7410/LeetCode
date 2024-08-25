class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for(int i = 0; i < arr.length; i++){
            arr[i] = bitsCounter(i);
        }
        return arr;
    }
    private int bitsCounter(int num){
        int count = 0;
        while(num != 0){
            if((num & 1) == 1) count++;
            num = num >> 1;
        }
        return count;
    }
}