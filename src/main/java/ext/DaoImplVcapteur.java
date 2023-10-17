package ext;

import dao.IDao;

public class DaoImplVcapteur implements IDao {

    @Override
    public double getData() {
        System.out.println("version capteur");
        double data=77;
        return data;
    }
}
