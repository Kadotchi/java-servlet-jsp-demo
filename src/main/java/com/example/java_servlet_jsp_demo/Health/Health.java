package com.example.java_servlet_jsp_demo.Health;

import java.io.Serializable;


/**
 * 健康診断に関する情報を持つJavaBeans
 */
public class Health implements Serializable {
    private double height, weight, bmi;

    private  String bodyType;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }


}
