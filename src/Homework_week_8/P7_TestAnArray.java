package Homework_week_8;
//Write a Java program to test an array list is empty or not.
// Define array list with underground tube names

import java.util.ArrayList;

public class P7_TestAnArray {
    public static void main(String[] args) {
        ArrayList<String> tubenames = new ArrayList<>();
        tubenames.add("Bakerloo");
        tubenames.add("District");
        tubenames.add("Picadilly");
        tubenames.add("jubilee");
        tubenames.add("overground");

        for (String underground : tubenames) {
            System.out.println(underground);
            System.out.println("Checking the above array list is empty or not! " + tubenames.isEmpty());
            tubenames.removeAll(tubenames);
            System.out.println("Array list after remove all elements " + tubenames);
            System.out.println("Checking the above array list is empty or not! " + tubenames.isEmpty());


        }
    }
}
