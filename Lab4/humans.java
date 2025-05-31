/*
WAP in java to demonstrate inheritance
*/
class Father {
    String fprop = "Car";
    int a = 4;

    void dispF() {
        System.out.println("Father has a car");
    }
}

class Son extends Father {
    String sprop = "Bike";
    int a = 5;  // Fixed variable declaration

    void dispS() {
        System.out.println("Son has a bike");
        System.out.println("Son receives from father: " + fprop);
    }
}

public class Humans {
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println("Son has: " + s.sprop);
        
        
        s.dispS(); 
    }
}
