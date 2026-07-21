class Solution {
    public int maxProfit(int[] prices) {
        int bestBuy = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            bestBuy = Math.min(bestBuy, price);
            maxProfit = Math.max(maxProfit, price - bestBuy);
        }

        return maxProfit;
    }
}