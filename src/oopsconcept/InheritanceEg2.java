package oopsconcept;

/**
 * Multiple Inheritance is NOT supported in Java.
 * Eg: Suppose if class Phone extends class Camera and class MusicPlayer, if both the class have the method turnOn(),
 *      compiler doesn't know which method to call out of the two, thus Java doesn't supports Multiple Inheritance.
 *
 * toString() : Method inherited from the Object Class. Used to return a string representation of an object.
 *              By default, it returns a hash code as a unique identifier. It can be overridden to provide meaningful details.
 *              System.out.println(dog1.toString()); -> System.out.println(dog1);   //.toString() usage while calling is redundant now.
 */

//Single Level Inheritance
class University{
    int regn_code;
}
class College extends University {
    String name;
    public String toString() {
        return "Name : " + name + ",  Registration Code : " + regn_code;
    }
}

//Hierarchical Inheritance
class Animal{
    String colour;
    String name;
    public void makeSound(){
        System.out.println("Makes Sound");
    }
    public void eatsFood() {
        System.out.println("Animal eats food.");
    }
}
class Dog extends Animal{
    public void makeSound() {
        System.out.println(name + " Barks!!");
    }
    public void eatsFood() {
        System.out.println(name + " eats meat.");
    }
    public void isPet() {
        System.out.println(name + " is a " + colour + " pet dog.");
    }
    public String toString() {
        return "Name : " + name + ",  Colour : " + colour;
    }
}
class Cat extends Animal{
    public void makeSound() {
        System.out.println(name + " Meows!!");
    }
    public void isPet() {
        System.out.println(name + " is a " + colour + " pet cat.");
    }
    public String toString() {
        return "Name : " + name + ",  Colour : " + colour;
    }
}

//Multilevel Inheritance
class Child extends Parent{
    String name;
    public String toString() {
        return "Name : " + name + " Surname : " + surname + " Age : " + age;
    }
}
class Parent extends Grandparent {
    String surname;
}
class Grandparent {
    int age;
}
public class InheritanceEg2 {
    public static void main(String[] args) {
        //Single Level Inheritance
        College college = new College();
        college.regn_code = 12345;
        college.name = "IEM";
        System.out.println(college);
        System.out.println("----------------------------------------");

        //Hierarchical Inheritance
        Dog dog = new Dog();
        dog.colour = "Brown";
        dog.name = "Tyson";
        System.out.println(dog);
        dog.eatsFood();
        dog.makeSound();
        dog.isPet();
        System.out.println();

        Cat cat = new Cat();
        cat.colour = "White";
        cat.name = "Shyanaya";
        System.out.println(cat);
        cat.eatsFood();
        cat.makeSound();
        cat.isPet();
        System.out.println("----------------------------------------");

        //Multilevel Inheritance
        Child child = new Child();
        child.age = 5;
        child.name = "Al-Hibibi";
        child.surname = "Khabib";
        System.out.println(child);
    }
}
