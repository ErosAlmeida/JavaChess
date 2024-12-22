import java.text.ParseException;
import java.util.Locale;
import entities.Account;
import entities.BusinessAccount;



public class App {
    
        public static void main(String[] args) throws ParseException {
            Locale.setDefault(Locale.US);
            
            Account sc = new Account(1101, "Nice maluko", 0.0);
            BusinessAccount bacc = new BusinessAccount(1001, "Herry",0.0 ,500.00);

            //UPCASTING
            Account acc1 = bacc;
            acc1.getBalance();
            BusinessAccount acc2 = new BusinessAccount(12001, "Yummi",0.1,800.00);

            //DOWCASTING 

            BusinessAccount acc4 = (BusinessAccount)acc2;
            acc4.loan(100.0);

            
 
    }

}