package entities;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class App {
    
        public static void main(String[] args) throws ParseException {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
            }
            catch(ArrayIndexOutOfBoundsException e){

                System.out.println("Invalid position");
            }
                catch(InputMismatchException a){
                    System.out.println("Name invalid");
                }



            sc.close();
        

 
    }

}