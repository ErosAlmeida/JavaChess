package modelDaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import db.DB;
import db.DbException;
import modelDao.SellerDao;
import modelEntities.Departament;
import modelEntities.Seller;

public class SellerDaoJDBC implements SellerDao{

    private Connection conn;

    public SellerDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Seller obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public void update(Seller obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void deleteById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement st = null;
        Result rs = null;
          try{
            st = conn.prepareStatement(

            "SELECT seller.*,department.Name as DepName"
           + " FROM seller INNER JOIN department"
           +  "ON seller.DepartmentId = department.Id "
           +  "WHERE seller.Id = ?");

            st.setInt(1, id);
            rs = (Result) st.executeQuery();
            if(((ResultSet) rs).next()){
                Departament dep = new Departament();
                dep.setId(((ResultSet) rs).getInt("Department"));
                dep.setName(((ResultSet) rs).getString("DeepName"));
                Seller obj = new Seller();
                obj.setId(((ResultSet) rs).getInt("Id"));
                obj.setName(((ResultSet) rs).getString("Name"));
                obj.setEmail(((ResultSet) rs).getString("Email"));
                obj.setBaseSalary(((ResultSet) rs).getDouble("BaseSalary"));
                obj.setBirthDate(((ResultSet) rs).getDate("BirthDate"));
                obj.setDepartament(dep);
                return obj;

            }
            return null;
          }
          catch(SQLException e){
            throw new DbException(e.getMessage());
          }finally{
            DB.closeConnection();
          }
    }

    @Override
    public List<Seller> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    
}
