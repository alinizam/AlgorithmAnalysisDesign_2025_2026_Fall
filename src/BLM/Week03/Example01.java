package BLM.Week03;

public class Example01 {
    public static void main(String[] args) {
        System.out.println(power(2,9));
    }
    static int power(int i,int p) {
        if (p == 0)
            return 1;
        int half=power(i, p / 2);
        System.out.print(p +"- ");
        if (p % 2 == 1) {
            System.out.println(":"+(half * half*i));
            return half * half*i;

        } else{
            System.out.println(":"+(half*half));
            return half * half;
        }
    }
}
