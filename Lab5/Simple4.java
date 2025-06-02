/*
Wap in Java
Create me a program simple2.java and put it in mypack 
Create a custom method void disp() that print "this is simple2" 
Create simple3 and in same package and call void disp from simple2 
Create simple4 and put it in differnet package 
Call void disp from simple2 using import 
*/

// File: anotherpack/Simple4.java
package anotherpack;

import mypack.Simple2; // Importing Simple2 from mypack

public class Simple4 {
    public static void main(String[] args) {
        Simple2 obj = new Simple2();
        obj.disp();  // Calling disp() from Simple2
    }
}

