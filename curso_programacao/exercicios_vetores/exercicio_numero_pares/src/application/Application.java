package application;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você irá digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int totalEven = 0;
        System.out.println();
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < vect.length; i++) {
            if(vect[i] % 2 == 0) {
                totalEven ++;
                System.out.print(vect[i] + " ");
            }
        }

        System.out.printf("%n%nQUANTIDADE DE PARES = %d", totalEven);
    }

}
