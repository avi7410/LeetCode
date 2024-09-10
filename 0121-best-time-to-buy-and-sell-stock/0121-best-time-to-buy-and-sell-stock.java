class Solution {
    public int maxProfit(int[] prices) {
        int prof = 0;
        int low = Integer.MAX_VALUE;
        for(int price : prices){
            if(price < low){
                low = price;
            }
            else{
                prof = Math.max(prof, price - low);
            }
        }
        return prof;
    }
}