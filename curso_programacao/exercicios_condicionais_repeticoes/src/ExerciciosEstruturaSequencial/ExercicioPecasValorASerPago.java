package ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPecasValorASerPago {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigoPeca1, numeroPecas1, codigoPeca2, numeroPecas2;
        double valorPeca1,valorPeca2, valorAPagar;

        codigoPeca1 = sc.nextInt();
        numeroPecas1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();
        sc.nextLine();
        codigoPeca2 = sc.nextInt();
        numeroPecas2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        valorAPagar = (numeroPecas1 * valorPeca1) + (numeroPecas2 * valorPeca2);
        System.out.printf("Valor a pagar : $%.2f", valorAPagar);
    }

}
