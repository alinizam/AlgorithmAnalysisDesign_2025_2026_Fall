package SEN.Week01;

public class Quiz1 {
    public static int evaluateLtoR(int[] a, int degree, int x){
        int sum=0;
        int operationCount=0;
        for(int i=degree;i>=0;i--){
            int power=1;
            for(int j=1;j<=i;j++){
                power=power*x;
                operationCount++;
            }
            sum+=power*a[i];
        }
        System.out.println("Operation Count LtoR: "+operationCount);
        return sum;
    }

    public static int evaluateRtoL(int[] a, int degree, int x){
        int sum=a[0];
        int operationCount=0;
        int power=1;
        for(int i=1;i<=degree;i++){
            power=power*x;
            sum=sum+power*a[i];
            operationCount++;
        }
        System.out.println("Operation Count RtoL: "+operationCount);
        return sum;

    }

    public static void main(String[] args) {
        int [] a={3,2,1,5};   //1x^2 + 2x + 3
        int degree=3;
        int x=2;
        System.out.println(evaluateLtoR(a,degree,2));
        System.out.println(evaluateRtoL(a,degree,2));
    }
}
