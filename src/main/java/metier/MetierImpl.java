package metier;

import dao.Daoimpl;
import dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")

public class MetierImpl implements IMetier {
    @Autowired
    private Idao dao ;

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
