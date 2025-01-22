import java.sql.Connection;
import java.util.Locale;

import db.DB;


public class App {
        public static void main(String[] args){
            Locale.setDefault(Locale.US);

            Connection conn = DB.getConnection();
            DB.closeConnection();
            

    }
    
}
