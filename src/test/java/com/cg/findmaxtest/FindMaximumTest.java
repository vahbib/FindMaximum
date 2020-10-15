package com.cg.findmaxtest;

import com.cg.findmaximum.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    @Test
    public void Test() {
        FindMaximum fM = new FindMaximum();
        Assert.assertEquals(56, fM.maxInt(24,56,12));
    }
    @Test
    public void TestF() {
        FindMaximum fM = new FindMaximum();
        Assert.assertEquals (56.0, fM.maxFloat(24.0f,56.0f,12.0f), 0.0f);
    }
}
