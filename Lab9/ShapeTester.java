/* 
# Shape Area Calculator (Java)

~ Write a Java program to create an abstract class Shape with
an abstract method calculateArea().
~ Derive two classes Rectangle and Circle from Shape and
override the calculateArea() method to calculate and print
the area of a rectangle and a circle, respectively.
~ Use the main() method to create objects of Rectangle and
Circle and test their calculateArea() methods.


## Description
This program demonstrates abstract classes and method overriding in Java. An abstract class `Shape` defines a method `calculateArea()`, which is implemented by `Rectangle` and `Circle` classes.

## How It Works
- `Shape`: Abstract class with `calculateArea()`
- `Rectangle`: Implements area as `length * width`
- `Circle`: Implements area as `π * radius²`
- `ShapeTester`: Tests both shapes and prints their areas

## Sample Output

*/
abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(12, 6);
        Shape circle = new Circle(8);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Circle Area: " + circle.calculateArea());
    }
}
