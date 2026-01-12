class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n1 = prices[0];
        int diff = 0;
        for(int i=1;i<prices.length;i++){
            if(n1>prices[i]){
                n1 = prices[i];
            }else{
                diff = prices[i]-n1;
                profit+=diff;
                n1 = prices[i];
            }
        }
        return profit;
        
    }
}