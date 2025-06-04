/* WAP in Java:  

A small program where you handle another type of exception of your choice
•	Include user input; this should create the exception 
•	Print the exception message to show that the exception is caught
•	Identify the exception handling keywords you used, and why 
•	Create a customized exception for the same code.
*/

import java.util.Scanner;
import java.util.InputMismatchException;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message); // Call parent
    }
}

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // New scanner

        try {
            System.out.print("Enter an integer: "); // Get input
            String input = scanner.next(); // Read input

            // Check digits
            if (!input.matches("\\d+")) {
                throw new InvalidInputException("Invalid input! Please enter a valid integer."); // Throw error
            }

            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number); // Print number
        } 
        catch (InvalidInputException ex) {
            System.out.println("Custom Exception caught: " + ex.getMessage()); // Handle custom
        } 
        catch (InputMismatchException ex) {
            System.out.println("Built-in Exception caught: Invalid input type!"); // Handle built-in
        } 
        finally {
            scanner.close(); // Close scanner
        }
    }
}
