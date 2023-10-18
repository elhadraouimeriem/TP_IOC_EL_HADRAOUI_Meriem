package pres;

import dao.DaoImp;
import ext.DaoImpl2;
import metier.IMetier;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImp dao=new DaoImp();//instanciation statique
        MetierImpl metier =new MetierImpl(dao);//injection via le constructeur
        metier.setDao(dao);//injection des dépendences
        System.out.println("résultat est :"+metier.calcul());
    }

}
