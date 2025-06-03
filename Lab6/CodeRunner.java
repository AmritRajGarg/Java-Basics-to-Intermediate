/* WAP in java to demonstrate the use of a simple interface. 
Show how the interface can be used by a class. 
*/
 
interface Shape {
    void display();
}

class Circle implements Shape {
    public void display() {
        System.out.println("Circle is being drawn");
    }
}

class Rectangle implements Shape {
    public void display() {
        System.out.println("Rectangle is being drawn");
    }
}

public class CodeRunner {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        shape1.display();
        shape2.display();
    }
}
