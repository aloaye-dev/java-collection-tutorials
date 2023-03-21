package com.dsaArray;

public class InserElementInArray {
    public static void main(String[] args) {

        int a[] = new int[5];

        //How to insert values in an array
        //  1, for(int j=0; j<a.length; j++){
        //  a[j] = j;
        //  }
        //How to insert values in an array
        a[0] = 12;
        a[1] = 34;
        a[2] = 15;
        a[3] = 67;
        a[4] = 48;

        for (int i =0; i < a.length; i++){
            System.out.println(a[i]+ " ");
        }
    }
}

// Reverse an arraylist in java
//    public static List<Integer> reverseArray(List<Integer> a) {
//        int start = 0;
//        int end = a.size() - 1;
//        while (start < end) {
//            int temp = a.get(start);
//            a.set(start, a.get(end));
//            a.set(end, temp);
//            start++;
//            end--;
//        }
//        return a;
//    }

