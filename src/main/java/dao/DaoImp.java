package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImp implements IDao{
    @Override
    public double getData() {
        System.out.println("version base de données");
        double data;
        data=34;
        return data;
    }

}
