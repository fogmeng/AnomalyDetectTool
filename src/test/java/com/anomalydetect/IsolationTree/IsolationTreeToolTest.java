package com.anomalydetect.IsolationTree;

import com.anomalydetect.Tool.DisplayTool;
import com.anomalydetect.Tool.FileTool;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

public class IsolationTreeToolTest {
    public double[] testData;
    public double[] testData2 = {199,203,203,307,299,189,187,198,200,201,204,199};
    @Before
    public void setUp() throws FileNotFoundException {
        testData = FileTool.getData("data.json");
    }

    @Test
    public void timeSeriesAnalyse() {
        IsolationTreeTool isolationTreeTool = new IsolationTreeTool();
        isolationTreeTool.timeSeriesAnalyse(testData);
        DisplayTool.showResult(isolationTreeTool);
    }
}