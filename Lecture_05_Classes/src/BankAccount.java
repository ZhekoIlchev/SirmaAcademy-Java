import java.text.DecimalFormat;
import java.util.List;

public class BankAccount {
    private static int ACCOUNT_ID = 1;
    private static double ACCOUNT_INTEREST_RATE = 0.02;

    private int id;
    private double balance;
    private double interestRate;

    public BankAccount() {
        this.id = ACCOUNT_ID++;
        this.balance = 0.00;
        this.interestRate = 0.02;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.setBalance(amount);
            System.out.printf("Deposited %.2f to ID%d%n", amount, this.id);
        } else {
            System.out.println("The deposited amount has to be greater than 0");
        }
    }

    public double getInterest(int years) {
        return this.balance * ACCOUNT_INTEREST_RATE * 10;
    }

    public static void setInterest(double interestRate, List<BankAccount> accounts) {
        ACCOUNT_INTEREST_RATE = interestRate / 10;

        for (BankAccount account : accounts) {
            account.setInterestRate(ACCOUNT_INTEREST_RATE);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void sendMessageForAccountCreation() {
        System.out.printf("Account ID%d created%n", this.id);
    }
}