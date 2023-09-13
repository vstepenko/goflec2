package ua.edu.duan.gof;

import ua.edu.duan.gof.figure.color.RedColor;
import ua.edu.duan.gof.figure.shape.Rectangle;
import ua.edu.duan.gof.figure.shape.Shape;

public class Application {
    public static void main(String[] args) {

        Shape yellowRectangle = new Rectangle(new RedColor());
        yellowRectangle.draw();
    }
}
