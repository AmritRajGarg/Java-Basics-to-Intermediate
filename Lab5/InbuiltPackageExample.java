//WAP a prog in java to demonstrate the use of an inbuilt package in java use a package that you have not used till this point

/*
Program: Demonstration of Inbuilt Java Package - java.time
Purpose: This Java program shows how to use the java.time package to work with date and time.

✅ Package Used: java.time
Key Classes:
LocalDate – represents date (year-month-day).
LocalTime – represents time (hour-minute-second).
LocalDateTime – combines date and time.
DateTimeFormatter – formats date/time into a readable format.
*/


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InbuiltPackageExample {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Get the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date & Time: " + currentDateTime);

        // Formatting Date and Time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date & Time: " + formattedDateTime);
    }
}
