package com.company;

public class Cylinder extends SolidOfRevolution {
    private double h;

    public Cylinder(double radius, double h) {
        super(Math.PI * radius * radius * h, radius);
        this.h = h;
    }
}
