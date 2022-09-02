package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int menQuantity = 0;
        int womenQuantity = 0;
        double womenTotalHeight = 0;
        double shorterHeight = 0;
        double greaterHeight = 0;
        int vectShorterPosition = 0;
        int vectGreaterPosition = 0;

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Person[] vect = new Person[n];

        for (int i = 0; i < vect.length; i++) {
            int position = i+1;
            System.out.print("Altura da " + position + "a pessoa: ");
            double height = sc.nextDouble();
            System.out.print("Genero da " + position + "a pessoa: ");
            char gender = sc.next().charAt(0);
            vect[i] = new Person(height, gender);

            if (gender == 'm' || gender == 'M') {
                menQuantity ++;
            }

            if (gender == 'f' || gender == 'F') {
                womenQuantity ++;
                womenTotalHeight += height;
            }
        }

        double womenAvgHeight = womenTotalHeight / womenQuantity;

        for (int i = 1; i < vect.length; i++) {
            if (vect[i].getHeight() < vect[vectShorterPosition].getHeight()) {
                shorterHeight = vect[i].getHeight();
                vectShorterPosition = i;
            }

            if (vect[i].getHeight() > vect[vectGreaterPosition].getHeight()) {
                greaterHeight = vect[i].getHeight();
                vectGreaterPosition = i;
            }
        }

        System.out.printf("Menor altura = %.2f%n", shorterHeight);
        System.out.printf("Maior altura = %.2f%n", greaterHeight);
        System.out.printf("Media da altura das mulheres = %.2f%n", womenAvgHeight);
        System.out.printf("Numero de homens = %d", menQuantity);
    }
}
