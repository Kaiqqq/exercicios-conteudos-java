package ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioRaioCirculo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio, area;

        System.out.print("Digite o valor do raio: ");
        raio = sc.nextDouble();
        area = pi * (raio * raio);

        System.out.printf("A área do circulo é de: %.4f", area);

        sc.close();
    }
}
