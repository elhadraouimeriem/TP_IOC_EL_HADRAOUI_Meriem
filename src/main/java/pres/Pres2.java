package pres;

import dao.IDao;
import ext.DaoImpl2;
import metier.IMetier;
import metier.MetierImpl;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
public class Pres2 {
    public static void main(String[] args) throws Exception{
       // DaoImpl2 dao=new DaoImpl2();//maniere statique
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        System.out.println(daoClassName);
        Class cDao=Class.forName(daoClassName);
        IDao dao =(IDao) cDao.getConstructor().newInstance();//==>new DaoImp() instanciation dynamique
        System.out.println(dao.getData());
        //MetierImpl metier =new MetierImpl();//maniere statique
        String metierClassName=scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.getConstructor().newInstance();
       // metier.setDao(dao);//maniere statique
        Method setDao=cMetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier,dao);// injection des dependences
        System.out.println("res: "+metier.calcul());
    }
}
