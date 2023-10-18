package metier;

import dao.DaoImp;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {
    @Autowired

    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao=dao;
    }
    @Override
    public double calcul() {
        double data =dao.getData();
        double res = data*33;
        return res;
    }
    public void setDao(IDao dao){
        this.dao=dao;
    }
}
