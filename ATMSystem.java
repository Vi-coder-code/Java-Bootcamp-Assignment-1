import java.util.Scanner;

public class ATMSystem {
    static int pin = 1234;
    static double userBalance = 10000;
    static double atmBalance = 5000;  
    static final double MAX_DEPOSIT = 50000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PIN validation
        System.out.print("Enter your PIN: ");
        if (sc.hasNextInt() && sc.nextInt() == pin) {
            while (true) {
                System.out.println("\n1. Withdraw\n2. Deposit\n3. Check Balance\n4. Exit");
                System.out.print("Choose an option: ");
                int option = sc.nextInt();

                switch (option) {
                    case 1: // Withdraw option
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();

                        if (withdrawAmount <= 0) {
                            System.out.println("Invalid amount. Please enter a positive value.");
                        } else if (withdrawAmount > userBalance) {
                            System.out.println("Insufficient account balance. Your current balance is: " + userBalance);
                        } else if (withdrawAmount > atmBalance) {
                            System.out.println("ATM doesn't have enough cash. Available ATM balance is: " + atmBalance);
                        } else {
                            userBalance -= withdrawAmount;
                            atmBalance -= withdrawAmount;
                            System.out.println("Withdrawal successful! Please collect your cash.");
                            System.out.println("Your remaining balance is: " + userBalance);
                            System.out.println("ATM remaining balance is: " + atmBalance);
                        }
                        break;

                    case 2: // Deposit option
                        System.out.print("Enter amount to deposit (Max 50000): ");
                        double depositAmount = sc.nextDouble();

                        if (depositAmount <= 0) {
                            System.out.println("Invalid amount. Please enter a positive value.");
                        } else if (depositAmount > MAX_DEPOSIT) {
                            System.out.println("Deposit exceeds the maximum limit of 50000.");
                        } else {
                            userBalance += depositAmount;
                            atmBalance += depositAmount;
                            System.out.println("Deposit successful!");
                            System.out.println("Your new balance is: " + userBalance);
                            System.out.println("ATM updated balance is: " + atmBalance);
                        }
                        break;

                    case 3: // Check balance option
                        System.out.println("Your current balance is: " + userBalance);
                        System.out.println("ATM current balance is: " + atmBalance);
                        break;

                    case 4: // Exit option
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        sc.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Incorrect PIN. Please try again.");
        }
    }
}
