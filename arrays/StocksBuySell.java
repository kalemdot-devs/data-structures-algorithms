package arrays;
import java.util.*;;

public class StocksBuySell {
    public static int buyAndSellStocks(int prices[]){
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int n = prices.length;
        for(int i=0; i<n; i++){
            if (buyingPrice<prices[i]) { // profit calculate 
                int profit = prices[i] - buyingPrice; // Today's profit
                maxProfit = Math.max(maxProfit, profit);

            } else {
                buyingPrice = prices[i]; // update buying price 

            }

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices));
    }
}
