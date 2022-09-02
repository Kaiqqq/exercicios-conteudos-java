package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class ExercicioNumeroNegativo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();
        if (numero < 0 ) {
            System.out.println("O numero é negativo");
        } else {
            System.out.println("O numero é positivo");
        }

        sc.close();
    }

}
