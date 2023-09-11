package ua.edu.duan.gof.figure.shape;

import ua.edu.duan.gof.figure.color.Color;

public abstract class Shape {

    private Color color;



    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();

    public Color getColor() {
        return color;
    }
}
