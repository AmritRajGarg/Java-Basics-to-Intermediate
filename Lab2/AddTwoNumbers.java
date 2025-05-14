//This Java program adds two integers provided via command-line arguments and displays the result. It includes basic error handling for incorrect or missing input.

public class AddTwoNumbers {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two numbers");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int sum = num1 + num2;

            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        }
    }
}
