package SEN.Week10;

import java.util.Arrays;

public class Example01 {
    public static void main(String[] args) {
        int dp[]=numberOFWays(6);
        System.out.println(Arrays.toString(dp));
    }

    static int [] numberOFWays(int n){
        int [] ways = new int [n];
        Arrays.fill(ways,0);
        ways[1]=1;
        ways[2]=2;
        for (int i = 3; i < n; i++) {
            ways[i]=ways[i-1]+ways[i-2];
        }
        return ways;
    }


}
