package section10.extra.boardingHouse;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Client client;

        Client[] bedrooms = new Client[10];

        System.out.print("Enter the number of rooms to be rented[1-10]: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("E-mail: ");
            String mail = scanner.next();

            System.out.print("Choose an bedroom[0-9]: ");
            int bedroom = scanner.nextByte();
            client = new Client(name, mail);

            bedrooms[bedroom] = client;
        }
        System.out.println("Occupied rooms");
        for (int i = 0; i < bedrooms.length; i++) {
            if (bedrooms[i] != null) {
                System.out.println(i + ": " + bedrooms[i]);
            }
        }
        scanner.close();
    }
}
