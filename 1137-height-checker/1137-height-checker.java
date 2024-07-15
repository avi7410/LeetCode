class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int[] expected = Arrays.copyOf(heights, heights.length);
        bubble(expected);
        for(int i=0; i<heights.length; i++){
            if(expected[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }

    public static void swap (int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static int[] bubble(int[] arr){
        int size=arr.length;
        for(int i=0; i<size-1; i++){
            boolean swapped = false;
            for(int j=0; j<size-1-i; j++){
                if(arr[j]>arr[j+1]){
                    swapped=true;
                    swap(arr, j, j+1);
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }
}