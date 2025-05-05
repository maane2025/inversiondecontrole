package pres;

import dao.Idao;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentationv2 {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassname = scanner.nextLine();
            Class cDao= Class.forName(daoClassname);
            Idao dao =(Idao) cDao.getConstructor().newInstance();
            String metierClassname = scanner.nextLine();
            Class cMetier= Class.forName(metierClassname);
            IMetier metier =(IMetier) cMetier.getConstructor().newInstance();
            Method setDao = cMetier.getMethod("setDao",Idao.class);
           setDao.invoke(metier,dao);
            System.out.println("Resultat="+metier.calcul());
        } catch (Exception e) {
            System.out.println("e.getMessage()");
        }
    }
}
