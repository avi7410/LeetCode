class Solution {
    public int getLucky(String s, int k) {
        int  num = 0;
        for(int i = 0; i < s.length(); i++){
            int temp = (int)s.charAt(i) - 'a' + 1;
            num += transform(temp, 1);
        }
        k--;
        return transform(num, k);
        
    }
    private int transform(int num, int k){
        if(k == 0){
            return num;
        }
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return transform(sum, k - 1);
    }
}