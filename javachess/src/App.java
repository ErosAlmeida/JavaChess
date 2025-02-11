//import java.sql.Connection;
import java.util.List;
import java.util.Locale;
import modelDao.DaoFactory;
import modelDao.SellerDao;
import modelEntities.Departament;
import modelEntities.Seller;

public class App {
        public static void main(String[] args){
            Locale.setDefault(Locale.US);

           SellerDao sellerDao = DaoFactory.creatSellerDao();
          
           Seller seller = sellerDao.findById(3);
           System.out.println(seller);

           System.out.println("\n==TESTE== : Seller findBydepartament=====");
           Departament department = new Departament(2, null);
           List<Seller> list = sellerDao.findByDepartment(department);

           for(Seller obj : list){
            System.out.println(obj);

           }

    }
    
}
