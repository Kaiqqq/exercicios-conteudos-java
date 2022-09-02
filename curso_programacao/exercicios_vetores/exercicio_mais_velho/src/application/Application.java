package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        Person[] vect = new Person[n];

        for (int i = 0; i < vect.length; i++) {
            int position = i+1;
            System.out.println("Dados da " + position + "a pessoa:");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            sc.nextLine();
            vect[i] = new Person(name, age);
        }

        String oldestPerson = null;
        int personPosition = 0;

        for (int i = 1; i < vect.length; i++) {
            if (vect[i].getAge() > vect[personPosition].getAge()) {
                oldestPerson = vect[i].getName();
                personPosition = i;
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + oldestPerson);
    }

}
