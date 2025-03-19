package Presentation;

import Dao.DaoImplV2;
import Metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        System.out.println("res est  "+metier.calcul());
    }
}
