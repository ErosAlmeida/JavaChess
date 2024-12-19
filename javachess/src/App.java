import entities.Departament;
import entities.HourContract;
import entities.Worker;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class App {
    private static final String WorkerLevel = null;
    
        public static void main(String[] args) throws ParseException {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            SimpleDateFormat stp = new SimpleDateFormat("dd/MM/yyyy");
    
            System.out.println("Enter the departament's name: ");
            String departamentName = sc.nextLine();
            System.out.println("Enter worker data: ");
            System.out.println("Name: ");
            String workerName = sc.nextLine();
            System.out.println("Base Salary: ");
            double baseSalary = sc.nextDouble();
    
            Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerName), baseSalary, new Departament(departamentName));

        System.out.println("How to may Wolker contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++){
            System.out.println("Enter contract #" + i + " data: ");
            System.out.println("Data (DD/MM/YYYY): ");
            Date contractData = stp.parse(sc.next());
            System.out.print("Value per hora");
            double valuePerhora = sc.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractData, valuePerhora, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calcule incume (MM/yyyy) : ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Nmae :" + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Incume for :" + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }

}