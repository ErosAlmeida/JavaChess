import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;

public class App {
        public static void main(String[] args){
    
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.println("Entre os dados do contrato: ");
            System.out.println("Numero: ");
            int number = sc.nextInt();
            System.out.println("Data (dd/MM/yyyy): ");
            LocalDate date = LocalDate.parse(sc.next(), fmt);
            System.out.println("Valor do contrato: ");
            double totalValue = sc.nextDouble();

            Contract obj = new Contract(number, date, totalValue);

            System.out.println("Entre o numero de parcelas: ");
            int n = sc.nextInt();

        




            sc.close();    

    }
    
}
