package com.newbei;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> myArray = new ArrayList(){{
            add(3);
            add(5);
            add(32);
            add(5);
            add(7);
        }};

        MyIntList myCollection = new MyIntList(myArray);
        System.out.println("===============================================");
        System.out.println(myCollection.toString());
        System.out.println("===============================================");
        System.out.println("Adding : 10");
        myCollection.add(10);
        System.out.println(myCollection.toString());
        System.out.println("Removing : 17");
        myCollection.remove(17);
        System.out.println(myCollection.toString());
        System.out.println("Find  element 25 its index         : " +       myCollection.findByValue(25));
        System.out.println("Find  element by index 0 its value : " +       myCollection.findByIndex(0));
        System.out.println("MaxElement: " + myCollection.maxElement() + "    MinElement: " + myCollection.minElement());
        System.out.println("Indices of total Elements 18"
                + myCollection.arrayIntToString(myCollection.indicesOfTotalElements(18)));

        int[] dublicate = myCollection.duplicateСontent();
        if (dublicate[0] > 1) System.out.println("True " + " Element " + dublicate[1] +
                " dublicated " + dublicate[0] + " times");
        else System.out.println("False no dublicate value in Array");
    }

}
