package ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCalculoSalario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horas;
        double valorHora, salario;

        System.out.print("Digite o número do funcionário: ");
        numero = sc.nextInt();
        System.out.print("Digite o número de horas trabalhadas: ");
        horas = sc.nextInt();
        System.out.print("Digite o valor recebido por hora: ");
        valorHora = sc.nextDouble();

        sc.close();

        salario = horas * valorHora;

        System.out.printf("O funcionário número %d tem o salário de $%.2f", numero, salario);
    }

}
