package entities;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Room Number: ");
            int number = sc.nextInt();
            System.out.println("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            if (!checkOut.after(checkIn)) {
                System.out.println("Error: Check-out date must be after check-in date.");
                return;
            }

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            Date newCheckIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            Date newCheckOut = sdf.parse(sc.next());

            if (!newCheckOut.after(newCheckIn)) {
                System.out.println("Error: Check-out date must be after check-in date.");
                return;
            }

            reservation.updateDates(newCheckIn, newCheckOut);
            System.out.println("Updated Reservation: " + reservation);

        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid data.");
        } finally {
            sc.close();
        }
    }
}
