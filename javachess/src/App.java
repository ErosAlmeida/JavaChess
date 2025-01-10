import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class App {
    private static final Double Balance = null;
    
        @SuppressWarnings("unused")
        public static void main(String[] args){
    
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
    
            Account account = new Account();
    
            System.out.println("Profine the data of account: ");
            System.out.println("Account: ");
            int number = sc.nextInt();
            System.out.println("Holder: ");
            String holder = sc.nextLine();
            System.out.println("Opening Balance: ");
            double openingBalance = sc.nextDouble();
            System.out.println("Limit of sake: ");
            double withDrawalLimit = sc.nextDouble();
    
            Account acc = new Account(number, holder, Balance, withDrawalLimit);

            System.out.println();
            System.out.println("Profine withDrawal information: ");
            double amount = sc.nextDouble();
            if (amount > acc.getWithDrawLimit()){
                System.out.println("WithDrawal ERROR: amount exceeds withdrawal limit ");
            }else if (amount > acc.getBalance()) {
                System.out.println("WithDrawal error: insufficien amount ");

            }else{
                acc.withDraw(amount);
                System.out.println("New WithDraw: " + acc.getBalance());
            }

            sc.close();    

    }
    
}
