package Presentation;

import Dao.IDao;
import Metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(new File("config.txt"));
        String daoClassName = sc.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao=(IDao)cDao.newInstance();

        String metierClassName = sc.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier=(IMetier)cMetier.getConstructor(IDao.class).newInstance(dao);

        System.out.println("res est   "+metier.calcul());


    }
}
