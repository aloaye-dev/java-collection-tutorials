package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("element1");
        list.add("element1");
        list.add("element2");
        list.add("element2");
        System.out.println(list);

        // List allows us to add null elements
        list.add(null);
        list.add(null);
        System.out.println(list);

        // To get the elements use list.get(index-of element);
    }
}
