// Parent Class
class BankAccount {

     double balance;

    // Constructor
    BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw method with standard $2 fee
    void withdraw(double amount) {

        double totalDeduction = amount + 2.00; // include fee

        if (balance >= totalDeduction) {
            balance -= totalDeduction;
            System.out.println("Withdrawal successful (Standard Account).");
            System.out.println("$2.00 fee applied.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}
// Subclass
class PremiumAccount extends BankAccount {

    // Constructor
    PremiumAccount(double balance) {
        super(balance);
    }

    // Override withdraw method
    @Override
    void withdraw(double amount) {

        System.out.println("Premium Account: No withdrawal fee!");

        // Temporarily add $2 so parent's logic deducts only the actual amount
        balance += 2.00;

        // Reuse parent logic instead of rewriting deduction code
        super.withdraw(amount);
    }
}
// Main Class
public class BankDemo {

    public static void main(String[] args) {

        // Normal Account
        BankAccount regular = new BankAccount(100);
        regular.showBalance();
        regular.withdraw(20);
        regular.showBalance();

        System.out.println("-----------------------");

        // Premium Account
        PremiumAccount premium = new PremiumAccount(100);
        premium.showBalance();
        premium.withdraw(20);
        premium.showBalance();
    }
}