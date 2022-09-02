package program;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println();

            list.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        if (hasId(list, id) == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter de percentage: ");
            double percentage = sc.nextDouble();
            list.stream().filter(x -> x.getId() == id).findFirst().orElse(null).increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");

        for (Employee emp : list) {
            System.out.println(emp);
        }

    }

    private static Boolean hasId(List<Employee> list, int id) {
        for (Employee employee : list) {
            if (employee.getId() == id) {
                return true;
            }
        }
        return null;
    }

}
