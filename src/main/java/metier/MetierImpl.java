package metier;

import dao.Daoimpl;
import dao.Idao;

public class MetierImpl implements IMetier {
    private Idao dao = null;

    public MetierImpl(Idao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double resultat = t*23;
        return resultat;
    }

    public void setDao(Idao dao) {
        this.dao = dao;
    }
}
