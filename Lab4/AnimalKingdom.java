/*

WAP in java to model the animal kingdom
animals are of two kinds birds and mammals 
you need to create a bird and a mammal object and display its characterstics 
list of charactrrstics no of wings no of limbs demonstrate the inheritance oops concept by 
a)identifying classes
b) identifying which characterstic belongs to which class
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
