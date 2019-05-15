package com.anomalydetect.Result;

/**
 * @program: AnomalyDetectTool
 * @description: A class to store result
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-05-08 09:56
 **/
public class Result {
    private int index;
    private double value;
    private double[] multiValue;
    private Boolean isMuti;
    private double score = 0;

    public Result(int index, double[] multiValue) {
        this.index = index;
        this.multiValue = multiValue;
        this.isMuti = true;
    }

    public Result(int index, double value) {
        this.index = index;
        this.value = value;
        this.isMuti = false;
    }

    public Result(int index, double[] multiValue,double score) {
        this.index = index;
        this.multiValue = multiValue;
        this.isMuti = true;
        this.score = score;
    }

    public Result(int index, double value,double score) {
        this.index = index;
        this.value = value;
        this.isMuti = false;
        this.score = score;
    }

    @Override
    public String toString() {
        String result = "Index is " + index+ ",  score is " + score + ",  value is ";
        if (isMuti) {
            for (double d : multiValue) {
                result += "[ " + d + " ],";
            }
            return result;
        } else {
            return "Index is " + index + ",  value is " + value+ ",  score is " + score;
        }
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Boolean getMuti() {
        return isMuti;
    }

    public void setMuti(Boolean muti) {
        isMuti = muti;
    }
}
