package com.anomalydetect.LOF;

import com.anomalydetect.Result.Result;
import com.anomalydetect.Tool.FileTool;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Administrator on 2018/4/27.
 */
public class LOFDetectToolTest {

    public double[] testData;
    public double[] testData2 = {199,203,203,307,299,189,187,198,200,201,204,199};

    @Before
    public void setUp() throws Exception {
        testData = FileTool.getData("data.json");
    }

    @Test
    public void timeSeriesAnalyse() throws Exception {
        LOFDetectTool lofDetectTool = new LOFDetectTool(200, 1);
        lofDetectTool.timeSeriesAnalyse(testData);
        ArrayList<Result> results = lofDetectTool.getResults();
        System.out.println(results);
    }

    @Test
    public void timeSeriesAnalyse2() throws Exception {
        LOFDetectTool lofDetectTool = new LOFDetectTool(10, 1);
        lofDetectTool.timeSeriesAnalyse(testData2);
        ArrayList<Result> results = lofDetectTool.getResults();
        //results.forEach(x-> System.out.println(x.toString()));
        lofDetectTool.timeSeriesAnalyse(testData2);
    }


}