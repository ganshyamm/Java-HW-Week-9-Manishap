package Homework_week_8;

import java.util.ArrayList;
import java.util.Iterator;
//Write a Java program to iterate through all elements in an array list using Iterator.

public class P5_IteratorElements {
    public static void main(String[] args) {

        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.add("Apple");
        fruitList.add("Mango");
        fruitList.add("Guava");
        fruitList.add("Orange");
        fruitList.add("Peach");
        System.out.println("The ArrayList elements are: ");

        for (Iterator itr = fruitList.iterator();
             itr.hasNext();) {
            System.out.println(itr.next());
        }

    }
}
