package application;

import module.entities.Account;
import module.exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");

        try {
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println();
            System.out.print("Enter ammount for withdraw: ");
            double ammount = sc.nextDouble();
            acc.withdraw(ammount);
            System.out.print("New balance: " + String.format("%.2f", acc.getBalance()));

        } catch (DomainException exc) {
            System.out.println(exc.getMessage());

        } catch (InputMismatchException exc) {
            System.out.println("Input error, inserted numbers must be integer");

        } catch (RuntimeException exc) {
            System.out.println("Unexpected error");
        }
    }

}
