package ua.edu.duan.gof;

import ua.edu.duan.gof.adapter.ListAdapter;
import ua.edu.duan.gof.alpha.AlphaListImp;
import ua.edu.duan.gof.beta.BetaSaveManager;

public class Application {
    public static void main(String[] args) {
        ListAdapter adapter = new ListAdapter(new AlphaListImp());
        adapter.add(10);
        adapter.add(20);
        adapter.add(30);
        BetaSaveManager.saveList(adapter);

    }
}
