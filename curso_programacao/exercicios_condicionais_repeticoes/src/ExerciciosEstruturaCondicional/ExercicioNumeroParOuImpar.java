package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class ExercicioNumeroParOuImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero inteiro: ");

        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }

        sc.close();
    }

}
