package com.cg.findmaxtest;

import com.cg.findmaximum.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaximumTest {
    @Test
    public void maximumTest(){
        Integer[] arr={1,54,62,88,100};
        FindMaximum fM=new FindMaximum(arr);
        Display(arr);
        Assert.assertEquals(100,fM.maxOf());
    }
    public static <E extends Comparable<E>> E Display(E[] element) {
        List<E> list = new ArrayList<E>();
        for (E e : element) {
            // Add each element into the list
            list.add(e);
        }
        Collections.sort(list);
        System.out.println("Maximum is: "+ list.get(list.size()-1));
        return list.get(list.size()-1);
    }
}