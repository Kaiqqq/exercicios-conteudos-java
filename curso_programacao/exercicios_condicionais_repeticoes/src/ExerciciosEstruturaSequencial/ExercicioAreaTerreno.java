package ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAreaTerreno {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double largura, comprimento, metroQuadrado, area, preco;

        System.out.print("Digite a largura do terreno: ");
        largura = sc.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        comprimento = sc.nextDouble();
        System.out.print("Digite o valor do metro quadrado do terreno: ");
        metroQuadrado = sc.nextDouble();

        area = largura * comprimento;
        preco = area * metroQuadrado;

        System.out.println("A área do terreno é de: " + area + "m²");
        System.out.println("O preço do terreno é de: $ " + preco);
    }
}
