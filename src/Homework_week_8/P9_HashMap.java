package Homework_week_8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P9_HashMap {
    public static void main(String[] args) {

        Map<Integer, String> peoplelist = new HashMap<>();
        peoplelist.put(1, "kelly");
        peoplelist.put(2, "kyara");
        peoplelist.put(3, "kishan");

        for (Map.Entry<Integer, String> name : peoplelist.entrySet()) {
            System.out.println(name);
        }
        //or use while loop when there is no fixed data
        Iterator itr = peoplelist.entrySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
    }

