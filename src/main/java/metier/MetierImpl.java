package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    IDao dao;
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
