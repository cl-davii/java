package section09.extra.bankAcc;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Random random = new Random();
        Account account;

        System.out.print("The account number is: ");
        int accountNumber = random.nextInt(1, 100);
        System.out.println(accountNumber);

        System.out.print("Type the name of account holder: ");
        String holder = scanner.nextLine();

        System.out.print("Do you want to do a initial deposit in your account? [y/n]: ");
        char initialDepositOption = scanner.next().charAt(0);

        if (initialDepositOption == 'y') {
            System.out.print("Enter the value to the initial deposit: ");
            double balance = scanner.nextDouble();
            account = new Account(accountNumber, holder, balance);
        } else {
            double balance = 0d;
            account = new Account(accountNumber, holder, balance);
        }

        System.out.println(account);

        System.out.print("Enter the quantity to deposit: ");
        double depositValue = scanner.nextDouble();
        account.deposit(depositValue);

        System.out.println(account);

        System.out.print("Enter the quantity to withdraw: ");
        double wdValue = scanner.nextDouble();
        account.withdraw(wdValue);

        System.out.println(account);

        scanner.close();
    }
}
