package SEN.Week03;

import javax.swing.*;

public class Example01 {
    public static void main(String[] args) {
        System.out.println(power(2,16));
    }
    static int power(int a, int p) {
        if (p==0){
            return 1;
        }

        int half=power(a, p/2);

        if (p%2==0)
            return half*half;
        else
            return half*half*a;
    }
}
