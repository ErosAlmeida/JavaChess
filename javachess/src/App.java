import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import entities.OrderItem;
import entities.Product;

public class App {
    
        public static void main(String[] args) throws ParseException {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            Product p = new Product("tv", 1000.0);
            OrderItem o1l = new OrderItem(1, 1000.0, p);

            System.out.println(o1l.getQuantity());
            System.out.println(o1l.getProduct().getNameProduct());
            System.out.println(o1l);
 
    }

}