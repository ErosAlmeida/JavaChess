import java.text.ParseException;
import java.util.Locale;
import entities.Account;
import entities.BusinessAccount;


public class App {
    
        public static void main(String[] args) throws ParseException {
            Locale.setDefault(Locale.US);
            
           Account acc1 = new Account(101, "Nicee", 1000.0);
           acc1.wihtdraw(200.0);
           System.out.println(acc1.getBalance());

           Account aacc2 = new Account(1002, "YUMMI", 1000.0);
           aacc2.wihtdraw(200.0);
           System.out.println(aacc2.getBalance());

           Account acc3 = new BusinessAccount(1003, "Yastt", 1000.0,500.0);
           acc3.wihtdraw(200.0);
           System.out.println(acc3.getBalance());

 
    }

}