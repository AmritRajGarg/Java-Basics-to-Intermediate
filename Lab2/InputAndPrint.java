/*
This simple Java program prompts the user to enter their name and then greets them with a message. 
It's a basic example of how to accept string input from the console using the Scanner class.
*/

import java.util.Scanner;
class InputAndPrint
{
    public static void main(String[] args) 
    {
        Scanner abc = new Scanner(System.in); 
        String username;

        System.out.println("Enter your name");
        username = abc.nextLine();
        System.out.println("Hello " + username);
        }
}
