package application;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        System.out.print("Quantos numeros você irá digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double biggerVectValue = vect[0];
        int vectPosition = 0;
        for (int i = 1; i < vect.length; i++) {
            if (vect[i] > biggerVectValue) {
                biggerVectValue = vect[i];
                vectPosition = i;
            }
        }

        System.out.printf("MAIOR VALOR: %.1f%n", biggerVectValue);
        System.out.print("POSICAO DO MAIOR VALOR = " + vectPosition);
     }

}
