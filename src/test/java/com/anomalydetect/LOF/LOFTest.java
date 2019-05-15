package com.anomalydetect.LOF;

import org.junit.Assert;
import org.junit.Test;

public class LOFTest {

    @Test
    public void findKthPoint() {
        LOF lof = new LOF(1);
        double[][] knn = {{1.0, 2.0}, {3.1, 4.0}};
        double[] x = {1.0, 2.0};
        Assert.assertEquals(lof.findKthPoint(knn, x)[0], 1.0, 0.1);
    }

    @Test
    public void testFindKthPoint() {
        LOF lof = new LOF(1);
        double[][] knn = {{1.0, 2.0}, {3.1, 4.0}};
        double[] x = {11.0,90};
        System.out.println(lof.findKthPoint(knn, x)[0]);
        System.out.println(lof.findKthPoint(knn, x)[1]);
        //Assert.assertEquals(lof.findKthPoint(knn, x)[0], 1.0, 0.1);
    }

}