package Utilities;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double Calculator (double currencyPrice, double ammountBought) {
        return (currencyPrice * IOF + currencyPrice) * ammountBought;
    }
}
