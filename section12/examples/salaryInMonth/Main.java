package section12.examples.salaryInMonth;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Worker worker;
        HourContract contract;

        System.out.print("Enter the department name: ");
        String departmentName = scanner.next();

        System.out.println("Enter the Worker data");
        System.out.print("Name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Level: ");
        String level = scanner.next();
        System.out.print("Base salary: ");
        double baseSalary = scanner.nextDouble();

        worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));

        System.out.print("How many contract have this worker: ");
        int numberContracts = scanner.nextInt();

        for (int i = 0; i < numberContracts; i++) {
            System.out.println("Enter the contract data #" + (i+1));
            System.out.print("Date[dd/mm/yyyy]: ");
            Date date = simpleDateFormat.parse(scanner.next());
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            System.out.print("Duration: ");
            int duration = scanner.nextInt();

            contract = new HourContract(date, valuePerHour, duration);
            worker.addContract(contract);
        }
        System.out.print("Enter the month and year to calculate the income[mm/yyyy]: ");
        String monthYear = scanner.next();
        int month = Integer.parseInt(monthYear.substring(0, 2));
        int year = Integer.parseInt(monthYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthYear + ": " + String.format("%.2f", worker.income(month, year)));

        scanner.close();
    }
}
