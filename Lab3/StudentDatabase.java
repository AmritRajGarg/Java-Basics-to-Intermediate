/* Wap in java
Take user input for three students
Insert roll no and name of three students and display them
While operate methods to insert and display the info
Program must contain two classes
Output 
Enter student name:
Enter student roll no:
 
The students present in database are 
111 Brad
222 tom
333  Peter
*/


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

