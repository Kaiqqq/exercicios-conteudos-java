package ExerciciosEstruturaCondicional;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioCalculoCardapio {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo, quantidade;
        double total;

        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        if(codigo == 1) {
            total = quantidade * 4.00;
            System.out.printf("Total: R$ %.2f", total);
        } else if (codigo == 2) {
            total = quantidade * 4.50;
            System.out.printf("Total: R$ %.2f", total);
        } else if (codigo == 3) {
            total = quantidade * 5.00;
            System.out.printf("Total: R$ %.2f", total);
        } else if (codigo == 4) {
            total = quantidade * 2.00;
            System.out.printf("Total: R$ %.2f", total);
        } else {
            total = quantidade * 1.50;
            System.out.printf("Total: R$ %.2f", total);
        }
    }

}
