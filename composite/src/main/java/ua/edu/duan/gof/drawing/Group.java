package ua.edu.duan.gof.drawing;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {

    private List<Component> components = new ArrayList<>();

    @Override
    public void draw() {
        System.out.println("Draw group with");
        for (Component component: components){
            component.draw();
        }
    }

    public void add(Component component) {
        components.add(component);
    }
}
