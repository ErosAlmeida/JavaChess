//import java.sql.Connection;
import java.util.Date;
import java.util.Locale;

import modelDao.DaoFactory;
import modelDao.SellerDao;
import modelEntities.Departament;
import modelEntities.Seller;

public class App {
        public static void main(String[] args){
            Locale.setDefault(Locale.US);

           Departament obj = new Departament(1, "Game");
           System.out.println(obj);

           SellerDao sellerDao = DaoFactory.creatSellerDao();

           Seller seller = new Seller(2, "Valhalla", "valhalla@nice.com", new Date(), 3000.0, obj );
           System.out.println(seller);
            
            

    }
    
}
