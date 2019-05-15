package com.anomalydetect.Tool;

import com.anomalydetect.Result.Result;

/**
 * @program: AnomalyDetectTool
 * @description: A tool to display
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-05-08 14:43
 **/
public class DisplayTool {
    public static void showResult(DetectTool detectTool) {

        for (Result result : detectTool.getResults()) {
            System.out.print("index:"+result.getIndex() + ", ");
        }
        System.out.println();
        for (Result result : detectTool.getResults()) {
            System.out.print("value:"+result.getValue() + ", ");
        }
    }
}
