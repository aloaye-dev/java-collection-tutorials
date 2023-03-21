package com.arrayList;

import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        //Collection<String> fruitCollection = new ArrayList<>();
        java.util.Collection<String> fruitCollection = new ArrayList<>();
        fruitCollection.add("Banana");
        fruitCollection.add("Mango");
        fruitCollection.add("Pear");
        fruitCollection.add("Orange");

        fruitCollection.remove("Pear");
        System.out.println(fruitCollection);


        fruitCollection.forEach((element)->{
            System.out.println(element);
        });
    }
}
