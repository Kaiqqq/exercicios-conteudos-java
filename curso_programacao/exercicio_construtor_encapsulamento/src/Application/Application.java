package Application;

import Entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there a initial deposit (y/n)? ");
        String response = sc.nextLine();

        if(response.equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, name, initialDeposit);

        } else {
            account = new Account(number, name);
        }

        System.out.println("Account data:");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();
        account.deposit(value);

        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        double withdraw =  sc.nextDouble();
        account.withdrawValue(withdraw);

        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }

}
