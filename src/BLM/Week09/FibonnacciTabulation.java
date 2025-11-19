package BLM.Week09;

import java.util.Arrays;

public class FibonnacciTabulation {
    public static void main(String[] args) {

        //int[] F=finonnacci(10);
        //System.out.println(Arrays.toString(F));
        int n=7;

        for(int j=0;j<n;j++) {
            int[] memo = new int[j + 1];
            Arrays.fill(memo, -1);
            int f = FibonnacciMemorization(j, memo);
            System.out.println(f);
        }


    }
    static int  fibonnacci0(int n) {
        int f0 = 0, f1 = 1;
        int fn=0, fn1 = f1, fn2 = f0;

        for (int i = 2; i <= n; i++) {
            fn = fn1 + fn2;

            fn2 = fn1;
            fn1 = fn;
        }
        return fn;
    }



    static int [] finonnacci(int n){
        int[] F=new int[n];
        F[0]=0;
        F[1]=1;
        for (int i=2;i<n;i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        return F;
    }
    static int FibonnacciMemorization(int n,int[] memo){
        if (n==0) return 0;
        if (n==1) return 1;
        if (memo[n]!=-1) return memo[n];
        memo[n]=FibonnacciMemorization(n-1,memo)+FibonnacciMemorization(n-2,memo);
        return memo[n];

    }

}
