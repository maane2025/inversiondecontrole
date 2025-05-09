package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class Daoimpl  implements Idao {



    @Override
    public double getData() {
        System.out.println("Version base de données");
        double temp= 23 ;
        return 0;
    }
}
