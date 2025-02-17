package section13.extra.productStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the the quantity of products: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data");
            System.out.print("Common, imported or used: [c/i/u]: ");
            char typeProduct = scanner.next().toLowerCase().charAt(0);
            if (typeProduct == 'c') {
                System.out.print("Name: ");
                String name = scanner.next();
                System.out.print("Price: ");
                double price = scanner.nextDouble();

                Product product = new Product(name, price);
                products.add(product);
            } else if (typeProduct == 'i') {
                System.out.print("Name: ");
                String name = scanner.next();
                System.out.print("Price: ");
                double price = scanner.nextDouble();
                System.out.print("Custom Fee: ");
                double customFee = scanner.nextDouble();

                ImportedProduct importedProduct = new ImportedProduct(name, price, customFee);
                products.add(importedProduct);
            } else if (typeProduct == 'u') {
                System.out.print("Name: ");
                String name = scanner.next();
                System.out.print("Price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter the product manufacturing date[dd/mm/yyyy]: ");
                Date manufacturingDate = simpleDateFormat.parse(scanner.next());

                UsedProduct usedProduct = new UsedProduct(name, price, new Date(manufacturingDate.getTime()));
                products.add(usedProduct);
            }
        }
        System.out.println("\nPrice Tags");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }
    }
}
