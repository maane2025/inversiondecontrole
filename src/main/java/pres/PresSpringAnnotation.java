package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ext","dao","metier");
        IMetier metier = context.getBean("metier", IMetier.class);
        System.out.println("Resultat="+metier.calcul());
    }
}
