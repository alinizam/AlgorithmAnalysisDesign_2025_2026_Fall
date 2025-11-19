package BLM.Week09;

import java.util.Arrays;

public class CoinRow {
    public static void main(String[] args) {
        System.out.println(getNumberOfWays(14,new long[]{3,4,6}));
  }
    static long getNumberOfWays(long N, long[] Coins)
    {
        long[] ways = new long[(int)N + 1]; // Create the ways array to 1 plus the amount to stop overflow
        // Set the first way to 1 because its 0, and there is 1 way to make 0 with 0 coins
        ways[0] = 1;
        // Go through all of the coins
        for (int i = 0; i < Coins.length; i++) {
            // Make a comparison to each index value of ways with the coin value.
            for (int j = 0; j < ways.length; j++) {
                if (Coins[i] <= j) {
                    // Update the ways array
                    ways[j] += ways[(int)(j - Coins[i])];
                }
            }
            System.out.println(Coins[i]+" "+Arrays.toString(ways));
        }
        return ways[(int)N];
    }

}
