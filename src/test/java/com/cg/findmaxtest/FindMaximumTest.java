package com.cg.findmaxtest;

import com.cg.findmaximum.FindMaximum;
import org.junit.Assert;

public class FindMaximumTest {
    public void Test() {
        FindMaximum fM = new FindMaximum();
        Assert.assertEquals(56, fM.maxInt(24,56,12));
    }
}
