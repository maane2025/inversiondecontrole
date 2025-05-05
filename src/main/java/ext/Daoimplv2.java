package ext;

import dao.Idao;



public class Daoimplv2 implements Idao {
    @Override
    public double getData() {

        System.out.println("Version web service");
        double t=11;
        return t;
    }
}
