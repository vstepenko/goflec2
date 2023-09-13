package ua.edu.duan.gof.car;

import ua.edu.duan.gof.car.Car;
import ua.edu.duan.gof.car.Drawing;
import ua.edu.duan.gof.car.SportCar;
import ua.edu.duan.gof.car.UnknownCar;

public class CarApplication {
    public static void main(String[] args) {
        Car sportCar = new SportCar();
        Car unknownCar = new UnknownCar();
        Drawing drawing = new Drawing();
        drawing.add(sportCar);
        drawing.add(unknownCar);
        drawing.draw("green");
        drawing.clear();
        drawing.add(sportCar);
        drawing.add(unknownCar);
        drawing.draw("white");
    }
}
