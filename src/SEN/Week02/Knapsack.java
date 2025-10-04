package SEN.Week02;

public class Knapsack {
    public static void main(String[] args) {
        int W=10;
        int n=3;
        int[] values= {2,5,9};
        int[] weights= {2,6,5};
        System.out.println(Knapsack(W,values,weights,n));
    }
    static int Knapsack(int availableSpace, int[] v, int[] w, int n){
        if (n==0)
            return 0;
        if (availableSpace<w[n-1]){
            return Knapsack( availableSpace, v, w, n-1);
        } else {
            int excValue=Knapsack(availableSpace, v, w, n-1);
            int incValue=v[n-1]+Knapsack(availableSpace-w[n-1], v, w, n-1);
            return Math.max(excValue,incValue);
        }


    }

}
