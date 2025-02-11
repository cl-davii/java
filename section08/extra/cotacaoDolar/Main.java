package section08.extra.cotacaoDolar;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("What is the dollar quote: ");
        double dollarQuote = scanner.nextDouble();

        System.out.print("How many dollars will you bought: ");
        double amountInReal = scanner.nextDouble();

        double total = CurrencyConverter.totalInReal(amountInReal, dollarQuote);
        System.out.printf("O valor total a ser pago em reais, incluindo IOF, é: R$ %.2f%n", total);

        scanner.close();
    }
}
