package section12.extra.orderSumary;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Client client;
        Order order;
        Product product;
        OrderItem item;

        System.out.println("Enter the client data");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth Date: ");
        Date birthDate = simpleDateFormat.parse(scanner.next());

        client = new Client(name, email, birthDate);

        System.out.println("\nEnter the order data");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(scanner.next());
        System.out.print("How many items will have the order: ");
        int itemsQuantity = scanner.nextInt();

        order = new Order(new Date(), orderStatus, client);

        for (int i = 1; i <= itemsQuantity; i++) {
            System.out.println("\nEnter the #" + i + " data");
            System.out.print("Product name: ");
            String productName = scanner.next();
            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            product = new Product(productName, productPrice);
            item = new OrderItem(quantity, productPrice, product);
            order.addItem(item);
        }
        System.out.println(order);
    }
}
