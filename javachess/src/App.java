import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Circle;
import entities.Retangle;
import entities.Shape;

public class App {
        public static void main(String[] args){
    
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            List<Shape> myShapes = new ArrayList<>();
            myShapes.add(new Retangle(3.0, 2.0));
            myShapes.add(new Circle(2.0));
            System.out.println("Total area: ");
            sc.close();    

    }
    public static double totalArea(List<Shape> list){
            double sum = 0.0;
            for(Shape s: list){
                sum += s.area();
            }

            return sum;

    }
    
}
