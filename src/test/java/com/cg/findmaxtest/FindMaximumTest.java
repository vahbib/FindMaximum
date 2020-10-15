package com.cg.findmaxtest;

import com.cg.findmaximum.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    public void Test() {
        @Test
        FindMaximum fM = new FindMaximum();
        Assert.assertEquals(56, fM.maxInt(24,56,12));
    }
}
