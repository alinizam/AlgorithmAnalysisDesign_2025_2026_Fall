package BLM.Week11;
public class Week12 {
    public static int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxProfit=0;
        int buyDay=0;
        int sellDay=0;
        int buyMinDay=0;
        int i=0;
        for (int price : prices) {
            if(price<minPrice){
                minPrice=price;
                buyMinDay=i;
            }
            int profit= price-minPrice;
            if(profit>maxProfit){
                maxProfit=profit;
                sellDay=i;
                buyDay=buyMinDay;
            }
            i++;
        }
        System.out.println("Buy Day:"+(buyDay+1)+" SellDay:"+(sellDay+1));
        return maxProfit;
    }
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        int [] prices2 = {7,2,5,6,1,3,4};
        System.out.println(maxProfit(prices));
    }

}
