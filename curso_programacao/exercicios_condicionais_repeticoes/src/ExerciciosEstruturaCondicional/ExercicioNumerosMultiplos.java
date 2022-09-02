package ExerciciosEstruturaCondicional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExercicioNumerosMultiplos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A, B;

        System.out.print("Digite o valor de A e B na ordem desejada: ");
        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        sc.close();
    }


}
