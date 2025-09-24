/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLM.Week01;

/**
 *
 * @author ali.nizam
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int b=75;
        boolean f=b>10;
        for (int i = (int)(Math.sqrt(b)); i > 0; i--) {
             System.out.println("-");
            if (b%i==0){
                System.out.println(i);
                break;
            }
        }
        
        
    }
    
}
