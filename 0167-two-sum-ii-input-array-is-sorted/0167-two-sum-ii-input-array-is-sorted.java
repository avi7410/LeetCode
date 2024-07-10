class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s;
        int size=numbers.length;
        int e;
        for(int i=0; i<size; i++){
            s=i+1;
            e=size-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(numbers[mid]+numbers[i]==target){
                    return new int[] {i+1,mid+1};
                }
                else if(numbers[mid]+numbers[i]<target){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
        }
        return new int[] {0,0};
    }
}