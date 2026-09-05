class Solution {
    public int maxProfit(int[] prices) {
        int costPrice = prices[0];
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i] > costPrice)
            {
                int currProfit = prices[i]-costPrice;
                if(currProfit > maxProfit)
                {
                    maxProfit = currProfit;
                }
            }
            if(costPrice > prices[i])
            {
                costPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
