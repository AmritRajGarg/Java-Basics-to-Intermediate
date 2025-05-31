/*
WAP in java to demonstrate inheritance with Grandfather class
*/

class Grandfather {
    String group = "House";
    int a = 7; // Original value of a in Grandfather class

    void dispGf() {
        System.out.println("Grandfather's group: " + group);
    }
}

class Father extends Grandfather {
    private String fprop = "Car"; // Changed fprop to private
    protected int a = 4; // Fixed variable declaration and made it protected

    void dispF() {
        System.out.println("Father has a car");
    }

    String getFprop() {
        return fprop;
    }
}

class Son extends Father {
    String sprop = "Bike";
    int a = 5; // Fixed variable declaration

    void dispS() {
        System.out.println("Son has a bike");
        System.out.println("Son receives from father: " + getFprop());
        System.out.println("Father's protected a: " + super.a); // Accessing protected variable 'a' from Father class
        System.out.println("Grandfather's a: " + ((Grandfather)this).a); // Accessing variable 'a' from Grandfather class
    }
}

public class Humans2 {
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println("Son has: " + s.sprop);
        
        s.dispS(); 
        s.dispF();
        s.dispGf(); // Calling Grandfather's dispGf method
    }
}
