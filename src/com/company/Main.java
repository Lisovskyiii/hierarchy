package com.company;


public class Main {

    public static void main(String[] args) {
        Ball ball = new Ball(2);
        Cylinder Cylinder = new Cylinder(2, 100);
        Pyramid pyramid = new Pyramid(15, 10);
        Box box = new Box(1000);

        System.out.println(box.add(ball));
        System.out.println(box.add(Cylinder));
        System.out.println(box.add(pyramid));
    }
}

