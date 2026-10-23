package day04;
// LC 121 -- Best time to buy & sell stock
/*Problem : u r given array prices, where prices[i] represents the stock price on day i
--choose one day to buy stock
--choose a later day to sell it
--ur goal is to maximize ur profit
--if u can not make a profit, return 0
----u must buy before u sell it
 */
/*Approach : Brute force
Logic : check every possible buying day against every later selling day 
Profit = selling price - buying proce
choose the maximum profit

 */
import java.util.Arrays;
public class p36 {
    void main() {
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println("Stock prices: "+ Arrays.toString(prices));
        System.out.println("Maximum profit: "+ result);
    }
    public static int maxProfit(int[] prices){
        int maxProfit = 0;
    for(int i = 0 ; i < prices.length ; i++){
        for(int j = i+1 ; j < prices.length ; j++){
            int profit = prices[j] - prices[i];
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
    }
    return maxProfit;
    }
}
