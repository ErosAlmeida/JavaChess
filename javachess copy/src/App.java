import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;

import db.DB;


public class App {
        public static void main(String[] args) throws SQLException{
            Locale.setDefault(Locale.US);

           Connection conn = null;
           Statement st = null;// fazer um consulta mysql
           ResultSet rs = null;//guardar e monstrar essa consulta

           try{
            conn = DB.getConnection();
            st = (Statement) conn.createStatement();
            rs = ((java.sql.Statement) st).executeQuery("select * from department");

            while (rs.next()) {
                System.out.println(rs.getInt("id" + " , " + rs.getString("Name")));
            }

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally {
            DB.closeResultSet(rs);
           DB.closeStatiment((java.beans.Statement) st);
            DB.closeConnection();
        }

    }
    
}
