package ExerciciosEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMediaPonderada {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double media;

        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            media = (2.0 * a + 3.0 * b + 5.0 * c) / 10;
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }

}
