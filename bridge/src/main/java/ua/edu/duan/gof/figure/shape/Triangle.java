package ua.edu.duan.gof.figure.shape;

import ua.edu.duan.gof.figure.color.Color;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle");
        getColor().fillColor();
    }

}
