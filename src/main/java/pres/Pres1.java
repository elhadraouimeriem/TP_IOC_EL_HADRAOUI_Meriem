package pres;

import dao.DaoImp;
import ext.DaoImpl2;
import metier.IMetier;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl2 dao=new DaoImpl2();
        MetierImpl metier =new MetierImpl();
        metier.setDao(dao);
        System.out.println("résultat est :"+metier.calcul());
    }

}
