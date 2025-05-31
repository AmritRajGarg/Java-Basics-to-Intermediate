/*
Animal Kingdom Model
This Java program models an animal kingdom using inheritance.

It features:

A base Animal class with common traits (name, numberOfLimbs).
Bird and Mammal subclasses that inherit from Animal and add their unique characteristics (e.g., numberOfWings for birds).
Method overriding to display specific details for each animal type.
The program creates an Eagle (Bird) and a Tiger (Mammal) to demonstrate how these objects display their inherited and unique traits.
*/


class Animal {
    String name;
    int numberOfLimbs;

    Animal(String name, int numberOfLimbs) {
        this.name = name;
        this.numberOfLimbs = numberOfLimbs;
    }

    void displayCharacteristics() {
        System.out.println(name + " has " + numberOfLimbs + " limbs.");
    }
}

class Bird extends Animal {
    int numberOfWings;

    Bird(String name, int numberOfLimbs, int numberOfWings) {
        super(name, numberOfLimbs);
        this.numberOfWings = numberOfWings;
    }

    @Override
    void displayCharacteristics() {
        super.displayCharacteristics();
        System.out.println(name + " also has " + numberOfWings + " wings.");
    }
}

class Mammal extends Animal {
    Mammal(String name, int numberOfLimbs) {
        super(name, numberOfLimbs);
    }

    @Override
    void displayCharacteristics() {
        super.displayCharacteristics();
        System.out.println(name + " does not have wings.");
    }
}

class AnimalKingdom {
    public static void main(String[] args) {
        Bird eagle = new Bird("Eagle", 2, 2);
        Mammal tiger = new Mammal("Tiger", 4);

        System.out.println("Characteristics of the Bird:");
        eagle.displayCharacteristics();

        System.out.println("\nCharacteristics of the Mammal:");
        tiger.displayCharacteristics();
    }
}
