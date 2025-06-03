/* WAP in Java:  
To demonstrate multiple inheritance using interfaces 
Interface A 
   Has points as input parameters 
Interface B 
   Has length as input parameter 
Create a class circle 
   Call both interfaces 
   A circle has radius as length and center as point
Display properties of 2 circles 
   2 objects 
   Auto increment 
   Put values of each circle 
   Display the parameters
*/
 
interface A {
    void setCenter(double x, double y);
    double[] getCenter();
}

interface B {
    void setRadius(double r);
    double getRadius();
}

class GeometricCircle implements A, B {
    private double x, y, radius;
    private static int counter = 0;
    private final int circleID;

    public GeometricCircle() {
        counter++;
        circleID = counter;
    }

    public void setCenter(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] getCenter() {
        return new double[] { x, y };
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void displayInfo() {
        System.out.println("Circle ID: " + circleID);
        System.out.println("Center: (" + x + ", " + y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("---------------");
    }
}

public class Main {
    public static void main(String[] args) {
        GeometricCircle circle1 = new GeometricCircle();
        circle1.setCenter(2.5, 3.0);
        circle1.setRadius(4.0);

        GeometricCircle circle2 = new GeometricCircle();
        circle2.setCenter(-1.0, 4.5);
        circle2.setRadius(3.5);

        circle1.displayInfo();
        circle2.displayInfo();
    }
}

