package dao;

public class DaoImp implements IDao{
    @Override
    public double getData() {
        System.out.println("versin base de données");
        double data;
        data=34;
        return data;
    }

}
