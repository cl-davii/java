package section08.extra.cotacaoDolar;

public class CurrencyConverter {

    private static final double iof = 0.06;

    public static double totalInReal(double realBought, double dollarQuote) {
        double totalReal = realBought * dollarQuote;
        double tax = totalReal * iof;
        return totalReal + tax;
    }
}
