package ExerciciosEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDivisao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double resultado;
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b == 0) {
                System.out.println("divisao impossivel");
            } else {
                resultado = (double) a / b;
                System.out.println(resultado);
            }

        }
    }

}
