package com.cg.findmaxtest;

import com.cg.findmaximum.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    @Test
    public void Test() {
        FindMaximum fM = new FindMaximum("A", "b", "Z");
        Assert.assertEquals("b", fM.maxOf());
    }

}
