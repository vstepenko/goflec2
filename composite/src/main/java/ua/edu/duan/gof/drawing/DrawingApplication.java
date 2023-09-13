package ua.edu.duan.gof.drawing;

public class DrawingApplication {
    public static void main(String[] args) {

        Component line1  = new Line(0,0,0,2);
        Component line2 = new Line(0,0,2,0);

        Component line3 = new Line(0,2,2,2);
        Component line4 = new Line(2,2,2,0);


        Group wall = new Group();
        wall.add(line1);
        wall.add(line2);
        wall.add(line3);
        wall.add(line4);

        Group house = new Group();
        house.add(wall);
        house.add(new Line(2,2,3,2));

        house.add(new Circle(1, 1, 1));
        house.draw();
    }
}
