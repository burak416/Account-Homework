import java.util.Scanner;

public class Account {
    private String ownerName;
    private double balance;
    private int password = 1234;
    int i = 0;

    public Account(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void add(double amount) {
        this.balance =balance+amount;
    }

    public void withdraw(double amount1) {
        while(i<3) {
            System.out.println("Please enter the 4-digit pass:");
            Scanner scanner = new Scanner(System.in);
            int Password = scanner.nextInt();
            if (Password == this.password) {
                if (this.balance < amount1) {
                    System.out.println("Your account doesn't have enough money.");
                    break;
                } else {
                    this.balance -= amount1;
                    System.out.println("Withdraw completed.");
                    break;
                }
            } else {
                System.out.println("Try again:");
                i++;
            }
        }
        if (i == 3) {
            System.out.println("Your account has been blocked, please try again later.");
        }
    }
    public double getBalance() {
        return this.balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return this.ownerName;
    }
}
