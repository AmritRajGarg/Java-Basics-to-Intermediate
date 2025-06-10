/* 
 Use a random number generating function
 Use a random string generating function
 Convert integer to string
 Convert to Float
 Convert String to Double

 Write a program to reverse a string using reverse() function.
 Write a program to reverse the same string without using
reverse() function. You may use other functions.
 Write a program to convert a byte array into string using any
encoding of your choice. Print both the byte and String
version.

*/

import java.util.Random;  

public class  StringAndNumberOperations {  

    public static void main(String[] args) {  
        Random random = new Random();  
        int randomNumber = random.nextInt(100) + 1;  
        System.out.println("Random Number: " + randomNumber);  

        String randomStr = generateRandomString(10);  
        System.out.println("Random String: " + randomStr);  

        String stringValue = Integer.toString(randomNumber);  
        System.out.println("Converted Integer to String: " + stringValue);  

        float floatValue = (float) randomNumber;  
        System.out.println("Converted Integer to Float: " + floatValue);  

        double doubleValue = Double.parseDouble(stringValue);  
        System.out.println("Converted String to Double: " + doubleValue);  

        String reversedStr = new StringBuilder(randomStr).reverse().toString();  
        System.out.println("Reversed String (using StringBuilder): " + reversedStr);  

        String reversedStrNoReverse = reverseString(randomStr);  
        System.out.println("Reversed String (without reverse method): " + reversedStrNoReverse);  

        byte[] byteArray = randomStr.getBytes();  
        String convertedString = new String(byteArray);  
        System.out.println("Byte Array: " + new String(byteArray));  
        System.out.println("Converted String from Byte Array: " + convertedString);  
    }  

    private static String generateRandomString(int length) {  
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";  
        StringBuilder sb = new StringBuilder(length);  
        Random random = new Random();  
        for (int i = 0; i < length; i++) {  
            int index = random.nextInt(chars.length());  
            sb.append(chars.charAt(index));  
        }  
        return sb.toString();  
    }  

    private static String reverseString(String s) {  
        StringBuilder reversed = new StringBuilder();  
        for (int i = s.length() - 1; i >= 0; i--) {  
            reversed.append(s.charAt(i));  
        }  
        return reversed.toString();  
    }  
}  
