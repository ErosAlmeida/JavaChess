//import java.sql.Connection;
import java.util.Locale;

import modelEntities.Departament;

public class App {
        public static void main(String[] args){
            Locale.setDefault(Locale.US);

           Departament obj = new Departament(1, "Nice");
           System.out.println(obj);
            
            

    }
    
}
