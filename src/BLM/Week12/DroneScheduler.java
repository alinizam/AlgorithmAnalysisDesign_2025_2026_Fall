package BLM.Week12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DroneScheduler {
    static class Flight{
        int start,end;
        Flight(int start,int end){
            this.start=start;
            this.end=end;
        }
    }

    public static void main(String[] args) {
        List<Flight> flights = Arrays.asList(
                new Flight(1,4), new Flight(3,5),new Flight(0,6),
                new Flight(5,7), new Flight(3,9), new Flight(12,16)
        );
        flights.sort(Comparator.comparingInt(f->f.end));

        List<Flight> selected = new ArrayList<>();
        int lastEnd=-1;
        for(Flight flight:flights){
            if(flight.start>=lastEnd){
                selected.add(flight);
                lastEnd=flight.end;
            }
        }
        System.out.println("Maximum number of flights: "+selected.size());
        for(Flight flight:selected){
            System.out.println("("+flight.start+" "+flight.end+")");
        }
    }

}
