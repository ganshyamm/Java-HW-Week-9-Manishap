package Homework_week_8;
//Write a Java program to create a new array list, add some colours (string) and printout the collection using
// for each loop.

import java.util.ArrayList;

public class P4_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Pink");
        colours.add("Green");
        colours.add("White");
        colours.add("Black");
        for (String colourname : colours) {
            System.out.println(colourname);
        }


    }}


