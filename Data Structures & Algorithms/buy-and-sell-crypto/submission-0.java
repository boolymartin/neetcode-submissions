class Solution {
    public int maxProfit(int[] prices) {
        int buyIndex = 0;
        int sellIndex = 0;
        int maxProfit = 0;

        for (int i=0; i<prices.length-1; i++) {
            int buy = prices[i];
            for (int j = i+1; j<prices.length; j++) {
                int sell = prices[j];
                if (sell-buy > maxProfit) {
                    maxProfit = sell-buy;
                    buyIndex = prices[i];
                    sellIndex = prices[j];
                }
            }
        }
        return maxProfit;
    }
}
