package ext;

import dao.Idao;
import org.springframework.stereotype.Component;

@Component("dao2")


public class Daoimplv2 implements Idao {
    @Override
    public double getData() {

        System.out.println("Version web service");
        double t=11;
        return t;
    }
}
