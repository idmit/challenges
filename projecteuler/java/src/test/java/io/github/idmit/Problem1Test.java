package io.github.idmit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem1Test {
    @Test
    public void test1() {
        Assert.assertEquals(23, Problem1.solveFor(10));
    }

    @Test
    public void test2() {
        Assert.assertEquals(233168, Problem1.solveFor(1000));
    }

}
