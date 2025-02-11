package section10.extra.salaryIncrease;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Informe a quantidade de funcionários: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Informe o seu id: ");
            int id = scanner.nextInt();

            System.out.print("Informe seu nome: ");
            String name = scanner.next();

            System.out.print("Informe seu salário: ");
            double baseSalary = scanner.nextDouble();

            Employee employee = new Employee(id, name, baseSalary);
            employees.add(employee);
        }
        System.out.print("Escolha o ID do funcionário que deseja realizar o aumento salarial: ");
        int selectedId = scanner.nextInt();

//        Integer position = employeeId(employees, selectedId);
        Employee emp = employees.stream().filter(employee -> employee.getId() == selectedId).findFirst().orElse(null);
//        if (position == null) {
        if (emp == null) {
            System.out.println("O ID informado não existe.");
        } else {
            System.out.print("Informe a porcentagem de aumento que deseja dar: ");
            int percentage = scanner.nextInt();
//            employees.get(position).increaseSalary(percentage);
            emp.increaseSalary(percentage);
        }
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static Integer employeeId(List<Employee> employees, int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
