package Arrays2;
import java.util.*;
public class Stocks {
    public static int Stock(int prices[]) {
        int BuyingPrice=Integer.MAX_VALUE;
        int MaxProfit=0;
        int n=prices.length;
        for (int i = 0; i < n; i++) {
            if(BuyingPrice<prices[i]){ //profit
                int profit=(prices[i]-BuyingPrice);
                MaxProfit=Math.max(MaxProfit,profit);
            }else{
                BuyingPrice=prices[i];
            }
        }
        return MaxProfit;
    }

    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int p=Stock(prices);
        System.out.println(p);
    }
}