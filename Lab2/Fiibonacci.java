/*
This Java program generates the Fibonacci series up to a user-defined maximum value. 
It also highlights even Fibonacci numbers with an asterisk (*) for easy identification.
*/

import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the max value for the Fibonacci series: ");
        int maxValue = scanner.nextInt();

        int num1 = 1, num2 = 1;
        System.out.println("The Fibonacci series till " + maxValue + " is:");
        
        int index = 1;
        while (num1 <= maxValue) {
            if (num1 % 2 == 0) {
                System.out.println(index + ":" + num1 + "*");
            } else {
                System.out.println(index + ":" + num1);
            }
            
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
            index++;
        }

        scanner.close();
    }
}
