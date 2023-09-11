package ua.edu.duan.gof.adapter;

import ua.edu.duan.gof.alpha.AlphaList;
import ua.edu.duan.gof.beta.BetaList;

public class ListAdapter implements BetaList {

    private AlphaList list;

    public ListAdapter(AlphaList list) {
        this.list = list;
    }

    public int getValue(int index) {
        return this.list.get(index);
    }

    public void add(int value) {
        this.list.add(value);
    }

    public int getSize() {
        return this.list.count();
    }

    public void setSize(int newSize) {
        if (newSize > this.list.count()) {
            while (this.list.count() < newSize) {
                this.list.add(0);
            }
        } else if (newSize < this.list.count()) {
            while (this.list.count() > newSize) {
                list.remove(list.count() - 1);
            }
        }
    }

}
