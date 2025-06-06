/* 
# Java Stack Interface Implementation

~ Write a Java program that defines an interface StackInterface with
three methods: push(), pop(), and display().
~ Implement this interface in a class called StackClass.
~ The StackClass should also contain the main method, where a
switch-case structure is used to allow users to select and perform
stack operations. 

## Description
This program demonstrates the use of **interfaces** in Java.
It defines a `StackInterface` with methods `push()`, `pop()`, and `display()`, which are implemented in the `StackClass`.

## Features
- Create a stack of user-defined size
- Perform stack operations using a switch-case menu:
  - Push an element
  - Pop an element
  - Display stack contents.
*/

import java.util.Scanner;

interface StackInterface {
    void push(int value);
    int pop();
    void display();
}

class StackClass implements StackInterface {
    private int[] stack;
    private int top;
    private int size;

    StackClass(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int stackSize = scanner.nextInt();

        StackClass stack = new StackClass(stackSize);

        while (true) {
            System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    stack.push(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Popped: " + stack.pop());
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
