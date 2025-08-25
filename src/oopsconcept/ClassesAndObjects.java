package oopsconcept;

/**
 * CLASS is a model from which objects get created. It is a logical entity.
 * It can be defined as a blueprint from which an individual Object can be created.
 *
 * An entity which has state and behavior is called an OBJECT.
 * In Oops concept we group related variables and methods that operate on variables into a single unit called OBJECT.
 * When we create an Object, some memory is being allocated, and it contains an unique address. It is a real world entity.
 *
 * The process of creating an Object from a Class is known as Instantiation. Every Object is an instance of a particular Class.
 * Eg : Bike is a Class, RR310 is an Object of Bike Class
 * Attributes : bodyColour, regnNum, price
 * Methods : shiftGear(), accelerate(), applyBrake()
 *
 * Java is not a pure OOP language because it supports primitive datatypes.
 */

class Calculator{
    public int add(int n1, int n2) {
        return  n1 + n2;
    }
}

class Bike{
    String company;
    String model;
    double price;
    int cc;

    void shiftGear() {
        System.out.println("Pressed clutch and shifted gear.");
    }
    void accelerate() {
        System.out.println("Pressed accelerator.");
    }
    void appyBrake() {
        System.out.println("Applied disc brakes.");
    }
}
public class ClassesAndObjects {
    public static void main(String[] args) {
        //Eg1
        int num1 = 10;
        int num2 = 20;
        Calculator calc = new Calculator();
        System.out.println("Sum : " + calc.add(num1, num2));

        //Eg2
        Bike bike = new Bike();
        bike.company = "BMW";
        bike.model = "RR310";
        bike.cc = 310;
        bike.price = 400000;

        System.out.println("Bike is a " + bike.company + " " + bike.model + " with " + bike.cc + "cc engine and costs INR " + bike.price);
    }
}
