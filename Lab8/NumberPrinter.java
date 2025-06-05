/* 
WAP in Java:  

• Write a program for generating 2 threads, one for printing even numbers and the other for printing odd numbers. 
• The two threads should be synchronized 
• The highest number to be printed has to be user input 
• Output: 
  o First the even numbers will be printed 
  o This will follow the odd numbers
*/

import java.util.Scanner;

class NumberPrinter {
    private int max;

    public NumberPrinter(int max) {
        this.max = max;
    }

    public synchronized void printEven() {
        for (int i = 2; i <= max; i += 2) {
            System.out.println("Even: " + i);
        }
    }

    public synchronized void printOdd() {
        for (int i = 1; i <= max; i += 2) {
            System.out.println("Odd: " + i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the highest number to print: ");
        int max = sc.nextInt();
        sc.close();

        NumberPrinter printer = new NumberPrinter(max);

        Thread evenThread = new Thread(() -> printer.printEven());
        Thread oddThread = new Thread(() -> printer.printOdd());

        // Start even thread first and wait for it to finish
        evenThread.start();
        try {
            evenThread.join();
        } catch (InterruptedException e) {
            System.out.println("Even thread interrupted");
        }

        // Then start odd thread
        oddThread.start();
    }
}
