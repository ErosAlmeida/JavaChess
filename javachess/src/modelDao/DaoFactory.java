package modelDao;

import db.DB;
import modelDaoImp.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao creatSellerDao(){
            return new SellerDaoJDBC(DB.getConnection());
       
    }
}
