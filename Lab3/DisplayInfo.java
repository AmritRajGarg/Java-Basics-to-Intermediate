/*
A simple Java program demonstrating basic OOP concepts — classes, objects, and methods.

💡 Features
Define a Student class with rollNo and name
Insert and display student records using methods
*/


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
 
public class DisplayInfo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
 
        s1.insertRecord(111, "Tom");
        s2.insertRecord(222, "Brad");
 
        s1.dispInfo();
        s2.dispInfo();
    }
}
