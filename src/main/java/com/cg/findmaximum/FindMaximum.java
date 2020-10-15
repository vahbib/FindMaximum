package com.cg.findmaximum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaximum<E extends Comparable> {
    //    public static void main(String[] args) {
//        System.out.println("Welcome to Find Maximum Problem of GENERIC");
//    }
    E array[];
    public FindMaximum(E[] array) {
        this.array = array;

    }
    public E maxOf() {
        List<E> list = new ArrayList<E>();
        // Array to List Conversion
        for (E e : array) {
            // Add each element into the list
            list.add(e);
        }
//        System.out.println("Maximum of these is: "+ Collections.max(list, null));
        return Collections.max(list, null);

//        Collections.sort(list);
//        System.out.println("Maximum is: "+ list.get(list.size()-1));

    }

}
