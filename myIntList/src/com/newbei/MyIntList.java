package com.newbei;

import java.util.ArrayList;
import java.util.List;

public class MyIntList {

    private List<Integer> elements = new ArrayList<Integer>();

    public MyIntList(List<Integer> elements) {
        this.elements = elements;
    }

    public void add(int element) {
        for(Integer i:elements){
            elements.set(elements.indexOf(i), i+element);
        }
        elements.add(element);
    }

    public void remove(int element) {
        elements.remove(elements.indexOf(element));
        for(Integer i:elements){
            this.elements.set(elements.indexOf(i), i-element);
        }
    }

    public int findByValue(int value) {
        return elements.indexOf(value);
    }

    public int findByIndex(int index) {
        return elements.get(index);
    }

    public int minElement() {
        int min = elements.get(0);
        for(Integer i:this.elements){
            if (min > i) min = i;
        }
        return min;
    }

    public int maxElement() {
        return elements.stream().max(Integer::compareTo).get();
    }

    public int[] indicesOfTotalElements(int sum){
        int[] sumIndex = new int[2];
        int sizeOfArray = elements.size();
        for(Integer first:elements){
            sumIndex[0] = elements.indexOf(first);
            if (sumIndex[0]<sizeOfArray)
                for (int second = sumIndex[0]+1; second < sizeOfArray; second++)
                    if ((first + elements.get(second)) == sum){
                        sumIndex[1] = second;
                        return sumIndex;
                    }
        }
        return sumIndex;
    }
    /**
     //     *     Returns an array of result[]  where (result[0]) is the number that repeats (result[1]) times
     */
    public int[] duplicateСontent() {
        int[] result = new int[2];
        int rezultIndex = 0;
        int sizeOfArray = elements.size();
        for (Integer intValue : elements) {
            result[0] = 1;
            for (int element = elements.indexOf(intValue)+1; element < sizeOfArray; element++) {
                if (intValue == elements.get(element)) {
                    result[0]++;
                    result[1] = intValue;
                }
                if (result[0] > 1) return result;
            }
        }
        return result;
    }


    @Override
    public String toString() {
        return "MyIntArrayList{" +
                "elements=" + elements +
                '}';
    }

    //Pars Array [ int ] to String
    public String arrayIntToString(int[] ints){
        Integer a = ints[0];
        Integer b = ints[1];
        return " [ " + a.toString() + " , " + b.toString() +" ] ";
    }
}
