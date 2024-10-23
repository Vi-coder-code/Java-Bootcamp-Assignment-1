import java.util.Scanner;

public class CombinedLoops {
    public static void main(String[] args) {
        // Example 4: Using a while loop with Scanner to read input until "exit"
        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("While loop with Scanner example (type 'exit' to quit):");
        while (!input.equalsIgnoreCase("exit")) {
            System.out.print("Enter something: ");
            input = scanner.nextLine();
            System.out.println("You entered: " + input);
        }
        System.out.println("Program terminated.");

        // Example 5a: Using break in a for loop
        System.out.println("\nFor loop with break example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                // Break the loop when i equals 5
                break;
            }
            System.out.println("i: " + i);
        }
        System.out.println("Loop ended due to break.");

        // Example 5b: Using continue in a for loop
        System.out.println("\nFor loop with continue example:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                // Skip even numbers
                continue;
            }
            System.out.println("Odd number: " + i);
        }

        // Example 5c: Using break in a while loop
        System.out.println("\nWhile loop with break example:");
        int num;
        while (true) {
            System.out.print("Enter a number (enter -1 to stop): ");
            num = scanner.nextInt();
            if (num == -1) {
                // Break the loop if -1 is entered
                break;
            }
            System.out.println("You entered: " + num);
        }
        System.out.println("Program ended due to break.");

        // Example 5d: Using continue in a while loop
        System.out.println("\nWhile loop with continue example:");
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                // Skip even numbers
                continue;
            }
            System.out.println("Odd number: " + i);
        }

        // Closing the scanner
        scanner.close();
    }
}
