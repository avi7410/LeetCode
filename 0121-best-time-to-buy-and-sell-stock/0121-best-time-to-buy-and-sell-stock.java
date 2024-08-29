class Solution {
    public int maxProfit(int[] prices) {
        int prof = 0;
        int min = prices[0];
        for(int price : prices){
            if(price < min){
                min = price;
            }
            else{
                int temp = price - min;
                prof = Math.max(temp, prof);
            }
        }
        return prof;
    }
}