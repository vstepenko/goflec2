package ua.edu.duan.gof.hello.world;

public class MainComponent implements InterfaceComponent {
    @Override
    public void doOperation() {
        System.out.print("World!");
    }
}
