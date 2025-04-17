class Solution {
    public int maxProfit(int[] prices) {
      int max_profit = 0;
      int min_buy_price = prices[0];
      for(int  i = 0 ; i < prices.length ; i++){
        min_buy_price = Math.min(min_buy_price , prices[i]);
        int current_profit = prices[i] - min_buy_price ;
        max_profit = Math.max(max_profit , current_profit);
      }  
      return max_profit;
    }
}