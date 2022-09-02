package application2;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        int n;
        double sum, average;

        System.out.print("Quantos numeros você irá digitar? ");
        n = sc.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        sum = 0;
        for(int i = 0; i < vect.length; i++){
            sum += vect[i];
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.2f ", vect[i]);
        }

        System.out.printf("%nSOMA = %.2f%n", sum);
        average = sum / vect.length;
        System.out.printf("MEDIA = %.2f", average);
    }

}
