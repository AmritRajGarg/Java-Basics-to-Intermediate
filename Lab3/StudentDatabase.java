# 📘 Student Database (Java)

This is a simple Java console program that takes input from the user to store and display information about three students using basic **OOP concepts**.

---

## 💡 Features
- Uses a `Student` class with `rollNo` and `name`
- Accepts user input using `Scanner`
- Stores data for 3 students and displays it

---

## 📦 How It Works
1. Takes student name and roll number as input
2. Stores each student’s data using `insertRecord()`
3. Displays the information using `dispInfo()`

---

## 🖥️ Sample Output


import java.util.Scanner;
 
class Student {
    int rollNo;
    String name;
 
    void insertRecord(int r, String n) {
        rollNo = r;
        name = n;
    }
 
    void dispInfo() {
        System.out.println(rollNo + " " + name);
    }
}
 
public class StudentDatabase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
 
        System.out.print("Enter student name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter student roll no: ");
        int rollNo1 = scanner.nextInt();
        scanner.nextLine();  // To consume the newline character
 
        s1.insertRecord(rollNo1, name1);
 
        System.out.print("Enter student name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter student roll no: ");
        int rollNo2 = scanner.nextInt();
        scanner.nextLine();
 
        s2.insertRecord(rollNo2, name2);
 
        System.out.print("Enter student name: ");
        String name3 = scanner.nextLine();
        System.out.print("Enter student roll no: ");
        int rollNo3 = scanner.nextInt();
 
        s3.insertRecord(rollNo3, name3);
 
        System.out.println("\nThe students present in the database are:");
        s1.dispInfo();
        s2.dispInfo();
        s3.dispInfo();
 
        scanner.close();
    }
}

