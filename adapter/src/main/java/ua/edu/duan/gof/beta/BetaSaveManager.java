package ua.edu.duan.gof.beta;

public class BetaSaveManager {

    public static void saveList(BetaList list) {

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(i + ": " + list.getValue(i));
        }

    }

}
