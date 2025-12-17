/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SEN.Week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ogrenci
 */
public class Quiz {

    public static int minStops(FuelStation[] stations, int startFuel, int D){
        Arrays.sort(stations, Comparator.comparingInt(s->s.dist));
        int fuel=startFuel;
        int stop=0;
        int idx=0;
        ArrayList<Integer> reachableFuels=new ArrayList();
        while(fuel<D){
            while(idx<stations.length && fuel>=stations[idx].dist){
                reachableFuels.add(stations[idx].fuel);
                idx++;
            }
            if(reachableFuels.isEmpty()){
                return -1;
            }
            int maxFuel=Collections.max(reachableFuels);
            fuel+=maxFuel;
            stop++;
            int removeIdx=reachableFuels.indexOf(maxFuel);
            reachableFuels.remove(removeIdx);
        }
        return stop;
    }
    public static void main(String[] args) {
        FuelStation[] stations={
            new FuelStation(10, 40),
            new FuelStation(20, 30),
            new FuelStation(30, 20),
            new FuelStation(60, 50),
            new FuelStation(80, 50)
        };
        int startFuel=10;
        int D=100;
        System.out.println("Min stop count:"+ minStops(stations, startFuel, D));
    }
    
}
