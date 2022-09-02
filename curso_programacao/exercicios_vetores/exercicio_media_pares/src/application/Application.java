package application;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int evens = 0;
        double evenTotal = 0;
        double evenAverage;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();

            if (vect[i] % 2 == 0) {
                evenTotal += vect[i];
                evens++;
            }
        }

        evenAverage = evenTotal / evens;

        if (evenTotal > 0) {
            System.out.printf("MEDIA DOS PARES = %.1f", evenAverage);
        } else {
            System.out.print("NENHUM NUMERO PAR");
        }
    }

}
