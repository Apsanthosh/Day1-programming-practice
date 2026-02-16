import java.util.Scanner;

public class ConsoleATM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0;  // Initial balance

        while (true) {

            // Display Menu
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    // Check Balance
                    System.out.println("Current Balance: $" + balance);
                    break;

                case 2:
                    // Deposit
                    System.out.print("Enter amount to deposit: $");
                    double deposit = scanner.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    // Withdraw
                    System.out.print("Enter amount to withdraw: $");
                    double withdraw = scanner.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid withdrawal amount.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful!");
                    }
                    break;

                case 4:
                    // Exit Program
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;  // Terminates the program

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
