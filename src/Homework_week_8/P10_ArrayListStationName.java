package Homework_week_8;

import java.util.ArrayList;
import java.util.List;

public class P10_ArrayListStationName {
    public static void main(String[] args) {
        List<String> Zone1 = new ArrayList<String>();
        Zone1.add("Baker Street ");
        Zone1.add("Charing Cross ");
        Zone1.add("Oxford Circus");
        Zone1.add("Edware Road");
        // Print the list
        System.out.println("Bakoor line Stations for ZONE 1" + Zone1);

        List<String> JubeleeLine = new ArrayList<String>();
        JubeleeLine.add("Bond Street ");
        JubeleeLine.add("Green Park");
        JubeleeLine.add("Charing Cross");
        JubeleeLine.add("Baker Street");
        // Print the list
        System.out.println("Jubilee  line Stations for ZONE 1" + JubeleeLine);

        List<String> centralLine = new ArrayList<String>();
        centralLine.add("Bank ");
        centralLine.add("Liverpool street");
        centralLine.add("Tottenham Street ");
        centralLine.add("Mile End");
        centralLine.add("Queens way");
        // Print the list
        System.out.println("Central line Stations for ZONE 1" + centralLine);


    }

}

