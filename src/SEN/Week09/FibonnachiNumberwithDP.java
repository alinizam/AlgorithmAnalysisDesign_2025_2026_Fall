package SEN.Week09;

public class FibonnachiNumberwithDP {
    public static void main(String[] args) {
        fibonnacciWithArray(10);
    }
    static int fibonnacci1(int n){
        int f0=0;
        int f1=1;
        int f_1,f_2;
        f_2=f0;
        f_1=f1;
        int fn=0;
        for (int i=1;i<=n;i++) {
            fn=f_1+f_2;
            System.out.println("f"+i+"= "+fn);
            f_2=f_1;
            f_1=fn;
        }
        return fn;

    }
    static int[] fibonnacciWithArray(int n){


        int F[]=new int[n+1];
        F[0]=0;
        F[1]=1;
        for (int i=2;i<=n;i++) {
            F[i]=F[i-1]+F[i-2];
            System.out.println("f"+i+"= "+F[i]);
        }
        return F;
    }


}
