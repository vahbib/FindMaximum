package com.cg.findmaxtest;

import com.cg.findmaximum.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    @Test
    public void maximumTest(){
        Integer[] arr={1,54,62,88,100};
        FindMaximum fM=new FindMaximum(arr);
        Assert.assertEquals(100,fM.maxOf());
    }
}
