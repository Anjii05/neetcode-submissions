class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minprice=prices[0];
        for(int r=0;r<prices.length;r++){
            minprice=Math.min(minprice,prices[r]);
            profit=Math.max(profit,prices[r]-minprice);
        }
       
       return profit;
    }
}
