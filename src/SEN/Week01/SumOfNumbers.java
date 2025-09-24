/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm;

/**
 *
 * @author ali.nizam
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        int n=1,m=10;                           // 2
        int sum=0;                              // 2
        for (int i = n; i <= m; i++) {          // 1
            sum+=i;                             // m-n
        }
        System.out.println("sum = " + sum);     // 1
        int sum1= ((m-n+1)*(m+n))/2;
        System.out.println("sum = " + sum1);     // 1
        
    }
    // m - n + 6   -- >  n 
}
