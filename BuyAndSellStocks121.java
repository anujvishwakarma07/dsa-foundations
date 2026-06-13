public class BuyAndSellStocks121 {
    public static int bestBuy(int prices[]) {
        int bestBuy = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < bestBuy) {
                bestBuy = prices[i];
            } else if (maxProfit < prices[i] - bestBuy) {
                maxProfit = prices[i] - bestBuy;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 6, 4, 3, 1 };
        System.out.println(bestBuy(prices));

    }
}
