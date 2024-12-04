import java.util.ArrayList;
import java.util.Scanner;

/**
 * Calculator with History
 * Created: December 3, 2024
 * Author: Gurkirat Singh
 * 
 * A simple calculator for addition and subtraction.
 * Tracks all calculations in a history log.
 */

public class CalculatorWithHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>(); // Stores past calculations
        boolean exit = false;

        System.out.println("Welcome to the Calculator!");

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. View History");
            System.out.println("4. Exit");
            System.out.print("Pick an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Addition
                    System.out.print("Enter two numbers: ");
                    double a1 = scanner.nextDouble();
                    double b1 = scanner.nextDouble();
                    double sum = a1 + b1;
                    System.out.println("Result: " + sum);
                    history.add(a1 + " + " + b1 + " = " + sum);
                    break;
                case 2:
                    // Subtraction
                    System.out.print("Enter two numbers: ");
                    double a2 = scanner.nextDouble();
                    double b2 = scanner.nextDouble();
                    double diff = a2 - b2;
                    System.out.println("Result: " + diff);
                    history.add(a2 + " - " + b2 + " = " + diff);
                    break;
                case 3:
                    // Show history
                    System.out.println("History:");
                    for (String entry : history) {
                        System.out.println(entry);
                    }
                    break;
                case 4:
                    // Exit program
                    System.out.println("Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}

