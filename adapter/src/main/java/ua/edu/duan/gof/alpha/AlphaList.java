package ua.edu.duan.gof.alpha;

public interface AlphaList {
    void add(int value);
    void insert(int index, int value);
    int get(int index);
    void set(int index, int value);
    int count();
    void remove(int index);
}
