package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum = 0;

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        Person[] vect = new Person[n];

        for(int i = 0; i < vect.length; i++){
            int posicao = i+1;
            System.out.println("Dados da " + posicao + "a pessoa:");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            sc.nextLine();
            vect[i] = new Person(name, age, height);
        }


        for (int i = 0; i < vect.length; i++){
            sum += vect[i].getHeight();
        }
        double average = sum / vect.length;
        System.out.printf("%nAltura média: %.2f%n", average);

        double individualPercentage = 100.00 / vect.length;
        double percentage = 0;

        for (int i = 0; i < vect.length; i++) {
            if(vect[i].getAge() < 16) {
                percentage += individualPercentage;
            }
        }

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%", percentage);
        for (int i = 0; i < vect.length; i++) {
            if(vect[i].getAge() < 16) {
                System.out.printf("%n%s", vect[i].getName());
            }
        }

    }

}
