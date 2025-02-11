package section09.extra.bankAcc;

public class Account {

    private static int number;
    private String name;
    private double balance;

    public Account(int number, String name, double balance) {
        Account.number = number;
        this.name = name;
        this.balance = balance;
    }

    public static int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void withdraw(double value) {
        balance -= (value + 5);
    }

    @Override
    public String toString() {
        return "Account\n" + "Number: " + number + " - Holder: " + name + " - Balance: " + balance;
    }
}
