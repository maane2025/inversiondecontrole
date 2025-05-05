package pres;

import dao.Daoimpl;
import ext.Daoimplv2;
import metier.MetierImpl;

public class Presentationv1 {


    public static void main(String[] args) {
        Daoimplv2 d = new Daoimplv2();

        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d);

        System.out.println("Resultat="+metier.calcul());
    }
}
