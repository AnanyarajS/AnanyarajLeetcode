class Solution {
    public int maxProfit(int[] prices) {
    int maxProfit = 0;
    int min = prices[0];
    for(int price:prices){
       if(min>price)
       min = price;
       int profit = price-min;
       if(maxProfit<profit)
       maxProfit = profit;
      }
    if(maxProfit<0)
     return 0;
     return maxProfit;

    }
}