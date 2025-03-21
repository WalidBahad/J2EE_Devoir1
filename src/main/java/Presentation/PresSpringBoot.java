package Presentation;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringBoot {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("Dao" , "Metier");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Res : "+ metier.calcul());
    }
}
