package com.xmc.demo2.after;

public class Square implements Quadrilateral{

    private double size;

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getLength() {
        return size;
    }

    @Override
    public double getWidth() {
        return size;
    }
}
