import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Account account1 = new Account("Burak", 123.0);
        account1.setOwnerName("Burak ER");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter amount that you want to add your balance:");
        double amount = scanner.nextDouble();
        account1.add(amount);
        System.out.printf("%s %s\n", account1.getOwnerName(), account1.getBalance());
        System.out.println("Please enter amount that you want withdraw from your balance:");
        double amount1 = scanner.nextDouble();
        account1.withdraw(amount1);
        System.out.printf("%s %s\n", account1.getOwnerName(), account1.getBalance());
    }
}