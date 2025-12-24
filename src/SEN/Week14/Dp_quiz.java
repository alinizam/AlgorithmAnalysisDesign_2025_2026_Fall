/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SEN.Week14;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ogrenci
 */
public class Dp_quiz {

    public static class Item{
        int weight,value;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
        
    }
    
    public static int groupKnapsack(List<List<Item>> groups, int W) {
        int G=groups.size();
        int [][] dp= new int[G+1][W+1];
        
        for (int g = 1; g <=G; g++) {
            for (int w = 1; w<=W; w++) {
                dp[g][w]=dp[g-1][w];
                
                for (Item item : groups.get(g-1)) {
                    if(item.weight<=w){
                        dp[g][w]=Math.max(dp[g][w], dp[g-1][w-item.weight]+item.value);
                    }
                }
            }
        }
        for (int i = 0; i <dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[G][W];
    }

    public static void main(String[] args) {
        Item i1=new Item(3,12);
        Item i2=new Item(3,14);
        Item i3=new Item(4,16);
        Item i4=new Item(4,18);
        Item i5=new Item(5,20);
        
        List<Item> g1=new ArrayList();
        g1.add(i1);
        g1.add(i2);
        
        List<Item> g2=new ArrayList();
        g2.add(i3);
        g2.add(i4);
        
        List<Item> g3=new ArrayList();
        g3.add(i5);
        
        List<List<Item>> groups=new ArrayList<>();
        groups.add(g1);
        groups.add(g2);
        groups.add(g3);
        
        int W=10;
        int maxValue=groupKnapsack(groups,W);
        System.out.println(maxValue);
        
    }
    
}
