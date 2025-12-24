/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEN.Week14;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ogrenci
 */
public class second_solution {

    

   
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

    public static class Item{
        int weight,value;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
        
    }
    private static Item getMaxItem(List<Item> group) {
        Item best=group.get(0);
        for (Item item : group) {
            if(item.value>best.value){
                best=item;
            }
        }
        return best;
    }
    
     public static List<Item> reduceGroups(List<List<Item>> groups) {
         List<Item> reduced=new ArrayList<>();
         
         for (List<Item> group : groups) {
             reduced.add(getMaxItem(group));
         }
         return reduced;
     }
     
    
    public static int groupKnapsack(List<Item> items, int W) {
        int n=items.size();
        int [][] dp= new int[n+1][W+1];
        
        for (int i = 1; i <=n; i++) {
            Item item=items.get(i-1);
            for (int w = 1; w <=W; w++) {
                dp[i][w]=dp[i-1][w];
                if(item.weight<=w){
                    dp[i][w]=Math.max(dp[i][w], dp[i-1][w-item.weight]+item.value);
                }
            }
        }
        
        for (int i = 0; i <dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[n][W];
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
        
        List<Item> reduced=reduceGroups(groups);
        int maxValue=groupKnapsack(reduced,W);
        System.out.println(maxValue);
        
    }
    
}


