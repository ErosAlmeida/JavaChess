import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Locale;

import db.DB;

public class App {
        public static void main(String[] args){
            Locale.setDefault(Locale.US);
            
            Connection conn = null;

            PreparedStatement st = null;

            try{
                DB.getConnection();
                st = conn.prepareStatement(

                    "UPDATE SELLER" 
                    + "SET BaseSalary = BaseSalary + ?"
                    + "WHERE "
                    + "(DepartamentId = ?)");
                    
                    st.setDouble(1, 200.0);
                    st.setInt(2, 2);

                    int rowsAffectd = st.executeUpdate();

                    System.out.println("Done! Rows Affected" + rowsAffectd);
            }
                    catch(SQLException e){
                        e.printStackTrace();
                    }
                    finally{
                        DB.closeStatement(st);
                        DB.closeConnection();
                    }
                
            
    }
  
}
