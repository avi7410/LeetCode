class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int trimSize = arr.length / 20;
        int sum = 0;
        for(int i = trimSize; i < arr.length-trimSize; i++){
            sum += arr[i]; 
        }
        return (double) sum / (arr.length - 2 * trimSize);
    }
}