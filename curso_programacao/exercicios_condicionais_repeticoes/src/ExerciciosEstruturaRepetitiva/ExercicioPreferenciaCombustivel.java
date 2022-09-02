package ExerciciosEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPreferenciaCombustivel {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int codigo = sc.nextInt();

        while(codigo != 4) {
            if(codigo == 1) {
                alcool++;
            } else if(codigo == 2){
                gasolina++;
            } else if(codigo == 3){
                diesel++;
            }
            codigo = sc.nextInt();
        }


        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }

}
