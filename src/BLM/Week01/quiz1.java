/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLM.Week01;

/**
 *
 * @author ali.nizam
 */
public class quiz1 {
    public static int evaluateRtoL(int [] a, int degree,int x){
        int p=0;
        int count=0;
        for (int i = degree; i >=0; i--) {
            int power=1;
            for (int j = 1; j <=i; j++) {
                power=power*x;
                count+=1;
            }
            p=p+a[i]*power;
            count+=1;
        }
        System.out.println("Method 1 count= "+count);
        return p;
    }
    public static int evaluateLtoR(int [] a, int degree,int x){
        int p=a[0];
        int power=1;
        int count=0;
        for (int i = 1; i <=degree; i++) {
            power=power*x;
            count++;
            p=p+a[i]*power;
            count++;
        }
        System.out.println("Method 2 count= "+count);
        return p;
    }
    public static void main(String[] args) {
        int A[]={4,3,5,5,2,1,3};
        int x=2;
        int degree=6;
        System.out.println(evaluateRtoL(A, degree, x));
        System.out.println(evaluateLtoR(A, degree, x));
        
    }
}
