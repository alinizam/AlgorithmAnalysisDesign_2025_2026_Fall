package SEN.Week09;

import java.util.Arrays;

public class FibboonacciWithDPMemoization {
        static int fibRec(int n, int[] memo) {
            if (n <= 1) {
                memo[n]=n;
                return n;
            }
            // To check if output already exists
            if (memo[n] != -1) { return memo[n];  }
            // Calculate and save output for future use
            memo[n] = fibRec(n - 1, memo) + fibRec(n - 2, memo);
            return memo[n];
        }
        static int fib(int n) {
            int[] memo = new int[n + 1];
            Arrays.fill(memo, -1);
            return fibRec(n, memo);
        }
        public static void main(String[] args) {
            int n = 7;
            int[] memo = new int[n + 1];
            Arrays.fill(memo, -1);
            fibRec(n, memo);
            fib(n);
            System.out.println(Arrays.toString(memo));
        }
    }

