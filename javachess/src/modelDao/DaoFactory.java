package modelDao;

import modelDaoImp.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao creatSellerDao(){
            return new SellerDaoJDBC();
       
    }
}
