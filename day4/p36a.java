package day4;

import java.util.Arrays;
//Best Time to but and sell stock
//LC 121
//Approach : Track minimum
public class p36a {
    void main() {
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println("Stock prices: "+ Arrays.toString(prices));
        System.out.println("Maximum profit: "+ result);
    }
    public static int maxProfit(int[] prices){
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
    for(int price : prices){
        if(price < min) min = price;
        else maxProfit = Math.max(maxProfit,price - min);
        
    }
    return maxProfit;
    }
}
