package Homework_week_8;
//Write a Java program to retrieve an element (at a specified index) from a given array list

import java.util.ArrayList;
import java.util.List;

public class P6_RetriveAnElement {

    public static void main(String[] args) {
        // Creae a list and add some colors to the list
        List<String> object = new ArrayList<String>();
        object.add("pencil");
        object.add("box");
        object.add("bag");
        object.add("rubber");
        object.add("bottle");
        // Print the list
        System.out.println(object);
        // Retrive the first and third element
        String element = object.get(0);
        System.out.println("First element: "+element);
        element = object.get(2);
        System.out.println("Third element: "+element);
    }
}



