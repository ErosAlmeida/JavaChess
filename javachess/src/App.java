//import java.sql.Connection;
import java.util.Locale;
import modelDao.DaoFactory;
import modelDao.SellerDao;

import modelEntities.Seller;

public class App {
        public static void main(String[] args){
            Locale.setDefault(Locale.US);

           SellerDao sellerDao = DaoFactory.creatSellerDao();
          
           Seller seller = sellerDao.findById(3);
           System.out.println(seller);
    }
    
}
