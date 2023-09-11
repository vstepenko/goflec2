package ua.edu.duan.gof.figure.shape;


import ua.edu.duan.gof.figure.color.Color;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
        getColor().fillColor();
    }

}
