package pres;

import dao.DaoImp;
import ext.DaoImpl2;
import metier.IMetier;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl2 dao=new DaoImpl2();//instanciation statique
        MetierImpl metier =new MetierImpl();
        metier.setDao(dao);//injection des dépendences
        System.out.println("résultat est :"+metier.calcul());
    }

}
