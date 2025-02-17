package section13.examples.employeeContract;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter the employees quantity: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data");
            System.out.print("Outsourced[y/n]: ");
            char outsourced = scanner.next().charAt(0);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            if (outsourced == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = scanner.nextDouble();
                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employeeList.add(employee);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                employeeList.add(employee);
            }
        }
        System.out.println("\nPayments");
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }
        scanner.close();
    }
}
