package ExerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class ExercicioFatorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fatorial = n;

        if(n != 1 && n!= 0) {
            for(int i = n - 1; i > 0; i--) {
                fatorial *= i;
            }
        } else {
            fatorial = 1;
        }

        System.out.println(fatorial);
        sc.close();
        /*
         int fatorial = 1; // fat = 24 // i = 5

        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
        sc.close();
        */

    }

}
