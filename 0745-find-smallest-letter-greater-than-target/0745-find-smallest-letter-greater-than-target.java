class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int size=letters.length;
        int e=size-1;
        int mid;
        while(s<=e){
            mid=s+((e-s)/2);
            if(letters[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        if(s>=size || e<0){
            return letters[0];
        }
        else return letters[s];
    }
}