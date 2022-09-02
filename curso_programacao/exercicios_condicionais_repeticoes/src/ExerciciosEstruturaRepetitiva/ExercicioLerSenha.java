package ExerciciosEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioLerSenha {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int senhaDigitada;

        senhaDigitada = sc.nextInt();
        while(senhaDigitada != 2002) {
            System.out.println("Senha Invalida!");
            senhaDigitada = sc.nextInt();
        }

        System.out.println("Acesso permitido!");
        sc.close();
    }

}
