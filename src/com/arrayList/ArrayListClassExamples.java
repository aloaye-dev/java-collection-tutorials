package com.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListClassExamples {
    public static void main(String[] args) {

        //Create an arrayList object
        List<String> fruit = new ArrayList<>();
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");

        //Ways of iterating through an arrayList

        // 1, for loop
        System.out.println("For Loop");
        for (int i = 0; i < fruit.size(); i++){
            System.out.println(fruit.get(i) + " ");
        }
        // 2, Advance forLoop
        System.out.println("\n\nAdvance For Loop");
        for (String fruits : fruit) {
            System.out.println(fruits + " ");
        }
        // 3, Java 8 Stream
        System.out.println("\n\nJava * Stream");
        fruit.forEach((differentFruits)->{
            System.out.println(differentFruits +  " ");
        });
    }
}
