package ua.edu.duan.gof.alpha;

import java.util.ArrayList;
import java.util.List;

public class AlphaListImp implements AlphaList {

    List<Integer> list = new ArrayList<>();

    @Override
    public void add(int value) {
        list.add(value);
    }

    @Override
    public void insert(int index, int value) {
        list.add(index, value);
    }

    @Override
    public int get(int index) {
        return list.get(index);
    }

    @Override
    public void set(int index, int value) {
        list.set(index, value);
    }

    @Override
    public int count() {
        return list.size();
    }

    @Override
    public void remove(int index) {
        list.remove(index);
    }
}
