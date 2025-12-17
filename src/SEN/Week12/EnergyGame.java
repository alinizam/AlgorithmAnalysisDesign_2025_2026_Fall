package SEN.Week12;

public class EnergyGame{

    public static int minDamage(int[] damage, int[] shielCost, int E) {
        int n = shielCost.length;
        int[][] dp = new int[n + 1][E + 1];

        int Inf = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= E; j++) {
                dp[i][j] = Inf;
            }
        }
        dp[0][E] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= E; j++) {
                if (dp[i - 1][j] == Inf) {
                    continue;
                }
                //                   inf        , Not use shield take demage
                dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + damage[i - 1]);

                int c = shielCost[i - 1];
                if (j >= c) {
                                          //use shield i-1.energy   //use i-1. solution
                    dp[i][j - c] = Math.min(dp[i][j - c], dp[i - 1][j]);
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= E; j++) {
                if (dp[i][j] > 100) {
                    System.out.print("-"+"\t");
                } else {
                    System.out.print(dp[i][j] + "\t");
                }
            }
            System.out.println("");
        }
        int minDamage=Inf;
        for (int i = 0; i <=E; i++) {
            minDamage=Math.min(minDamage, dp[n][i]);
        }
        return minDamage;
    }

    public static void main(String[] args) {
        int e = 10;
        int[] damage = {1, 2, 3, 4, 5};
        int[] shieldCost = {1,1,1,1,1};
        System.out.println("Min Damage= "+ minDamage(damage, shieldCost, e));
    }
}
