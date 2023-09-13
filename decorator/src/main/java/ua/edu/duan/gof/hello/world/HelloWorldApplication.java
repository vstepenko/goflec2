package ua.edu.duan.gof.hello.world;

public class HelloWorldApplication {

    public static void main(String[] args) {

        Decorator c = new DecoratorHello(new MainComponent());
        c.doOperation();
        System.out.println();
        c.newOperation();

    }
}
