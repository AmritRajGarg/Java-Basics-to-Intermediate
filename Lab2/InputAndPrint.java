//WAP in Java to take your name as input and display the name.

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
