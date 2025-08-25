package oopsconcept;

import java.util.Scanner;

/**
 * POLY means MANY and MORPH means SHAPE or FORMS
 * Objects can identify as themselves(Puppies) as well as other objects(Animals).
 * Objects can be treated as objects of a common superclass.
 * Can be achieved using classes or interfaces.
 *
 * Runtime Polymorphism happens when the method that gets executed is decided at runtime based on the actual type of the object.
 */

//Polymorphism using CLASS
abstract class Animals {
    abstract void makeSound();
}
class Puppies extends Animals {
    public void makeSound() {
        System.out.println("Puppy Barks.");
    }
}
class Kittens extends Animals {
    @Override
    public void makeSound() {
        System.out.println("Kitten Meows.");
    }
}

//Polymorphism using INTERFACE
interface LivingOrganism {
    void breathe();
}
class Tiger implements LivingOrganism{
    @Override
    public void breathe() {
        System.out.println("Tiger is breathing 🐅");
    }
}
public class PolymorphismEg {
    public static void main(String[] args) {
        //Eg: Polymorphism using Class
        Animals puppy = new Puppies();  //Upcasting
        puppy.makeSound();
        Animals kitten = new Kittens(); //Upcasting
        kitten.makeSound();

        Animals[] animals = {puppy, kitten};
        for(Animals animal : animals)
            animal.makeSound();

        System.out.println();

        //Polymorphism using Interface
        Tiger tiger = new Tiger();
        tiger.breathe();

        //Runtime Polymorphism
        Scanner sc = new Scanner(System.in);
        Animals animal;
        System.out.print("\nDo you want a Puppy or Kitten (P/K) ? ");
        String choice = sc.next().toUpperCase();
        if(choice.equals("P")) {
            animal = new Puppies();
            puppy.makeSound();
        } else if(choice.equals("K")) {
            animal = new Kittens();
            kitten.makeSound();
        } else
            System.out.println("Invalid Input!!");
    }
}
