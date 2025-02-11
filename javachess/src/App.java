//import java.sql.Connection;
import java.sql.Date;
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
          
           System.out.println("=== TEST 1: seller findById =====");
           Seller seller = sellerDao.findById(3);
           System.out.println(seller);
           
           System.out.println("\n=== TEST 2: seller findByDepartment =====");
           Departament department = new Departament(2, null);
           List<Seller> list = sellerDao.findByDepartment(department);
           for (Seller obj : list) {
               System.out.println(obj);
           }
   
           System.out.println("\n=== TEST 3: seller findAll =====");
           list = sellerDao.findAll();
           for (Seller obj : list) {
               System.out.println(obj);
           }
   
           System.out.println("\n=== TEST 4: seller insert =====");
           Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(0), 4000.0, department);
           sellerDao.insert(newSeller);
           System.out.println("Inserted! New id = " + newSeller.getId());
   
           System.out.println("\n=== TEST 5: seller update =====");
           seller = sellerDao.findById(1);
           seller.setName("Martha Waine");
           sellerDao.update(seller);
           System.out.println("Update completed");
           }

}  
    

