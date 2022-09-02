package program;

import service.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        Rent[] vect = new Rent[10];

        for (int i = 1; i < n; i++) {
            System.out.printf("%nRent #%d%n", i);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Rent(name, email, room);
            sc.nextLine();
        }

        System.out.println();
        System.out.println("Busy rooms: ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(vect[i].toString());
            }
        }
    }

}
