class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> nums = new ArrayList<Integer>();
        for(int i=0;i<digits.length;i++){
            nums.add(digits[i]);
        }
        int pt=digits.length;
        int c=1;
        int x=0;
        while(c>0){
            --pt;
            if(pt<0){
                nums.add(0,c);
                break;
            }
            x=nums.get(pt);
            x=x+c;
            c=x/10;
            x=x%10;
            nums.set(pt,x);
            
        }
        int[] ans = new int[nums.size()];
        for(int i=0; i<nums.size() ;i++){
            ans[i]=nums.get(i);
        }
        return ans;
    }
}