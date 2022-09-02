package application;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] vect = new double[n];

        double vectTotal = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            vectTotal += vect[i];
        }

        double vectAverage = vectTotal / vect.length;
        System.out.printf("%nMEDIA DO VETOR = %.3f%n", vectAverage);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i < vect.length; i++) {
            if(vect[i] < vectAverage) {
                System.out.println(vect[i]);
            }
        }
    }

}