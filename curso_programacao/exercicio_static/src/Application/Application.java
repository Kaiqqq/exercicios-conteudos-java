package Application;

import Utilities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("how many dollars will be bought? ");
        double dollarAmmount = sc.nextDouble();

        System.out.printf("Ammount to be paid in reais = %.2f", CurrencyConverter.Calculator(dollarPrice, dollarAmmount));
    }

}
