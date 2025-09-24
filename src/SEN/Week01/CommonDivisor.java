/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEN.Week01;

/**
 *
 * @author ali.nizam
 */
public class CommonDivisor {
    public static void main(String[] args) {
        System.out.println(findCommonDivisorEuclid(12, 16));
    }
    public static int findCommonDivisor(int m, int n){
        int result=1;
        for (int i = 1; i < n || i< m; i++) {
            System.out.println(i);
            if (m%i==0 && n%i==0){
                result=i;
                
            }
        }
        return result;
    
    }
     public static int findCommonDivisor1(int m, int n){
        int result=1;
        int small=n<m?n:m;
        for (int i = 1; i < small; i++) {
            System.out.println(i);
            if (m%i==0 && n%i==0){
                result=i;
                
            }
        }
        return result;
    
    }
     
    public static int findCommonDivisor2(int m, int n){
        int result=1;
        int small=n<m?n:m;
        for (int i = small; i > 1; i--) {
            System.out.println(i);
            if (m%i==0 && n%i==0){
                result=i;
                break;
            }
        }
        return result; 
    } 
    public static int findCommonDivisorEuclid(int m, int n){
        if (n==0) return m;
        int r=m%n;
        System.out.println(m+" "+n);
        return findCommonDivisorEuclid(n,r); 
    }
}
