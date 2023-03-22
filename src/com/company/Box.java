package com.company;

import java.util.ArrayList;

public class Box extends Shape {
    final ArrayList<Shape> shapes = new ArrayList<>();
    private double mesto;

    public Box(double mesto) {
        super(mesto);
        this.mesto = mesto;
    }

    public boolean add(Shape sh) {
        if (mesto >= sh.getVolume()) {
            shapes.add(sh);
            mesto -= sh.getVolume();
            return true;
        } else {
            return false;
        }
    }
}
