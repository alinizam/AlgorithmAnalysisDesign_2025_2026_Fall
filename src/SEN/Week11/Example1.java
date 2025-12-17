package SEN.Week11;

public class Example1 {
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        int buyDay=0;
        int buyDay1=0;
        int sellDay=0;
        int i=0;
        for(int price: prices){
            if(price<minPrice){
                minPrice=price;
                buyDay=i;
            }
            int profit=price-minPrice;
            if(profit>maxProfit){
                maxProfit=profit;
                sellDay=i;
                buyDay1=buyDay;
            }
            i++;
        }
        System.out.println("BuyDay:"+(buyDay1+1)+" SellDay:"+(sellDay+1));
        return maxProfit;
    }
    public static void main(String[] args) {
        int [] arr = {7, 1, 5, 4, 6,3};
        int [] arr2 = {7, 2, 3, 4, 6,1,2,4};
        System.out.println(maxProfit(arr2));
    }
}
