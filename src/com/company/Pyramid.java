package com.company;

public class Pyramid extends Shape {
    final double h;
    final double s;

    public Pyramid(double h, double s) {
        super(h * s * 4 / 3);
        this.h = h;
        this.s = s;
    }
}
