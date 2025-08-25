package oopsconcept;

/**
 * 'abstract' keyword is used to define classes and methods as abstract.
 * Abstraction is the process of hiding implementation details and showing only the essential features.
 * Abstract classes :
 * • cannot be instantiated directly.
 * • can contain 'abstract methods' (which must be implemented) and 'concrete methods' which are inherited but can also be overridden.
 * • should be extended via 'extend' keyword.
 * If the abstract method in abstract class A is not getting defined in the child class B,
 * then we will have to define the child class B as abstract as well.
 * Further in child class C which will extend child class B, we have to define the undefined abstract method.
 *
 * Declaring a class abstract only means that you don't allow it to be instantiated on its own.
 *
 * Declaring a method abstract means that subclasses have to provide an implementation for that method.
 *
 * We can create abstract class without any abstract method. Eg. of abstract class without abstract method is HttpServlet
 * But we cannot hold a abstract method in a non-abstract class.
 */
public class AbstractionEg {
    public static void main(String[] args) {

        //Eg1
        Triangle triangle = new Triangle(23, 34);
        System.out.printf("%.2f \n",triangle.area());
        triangle.display();
        System.out.println();

        Circle circle = new Circle(34);
        System.out.printf("%.2f \n", circle.area());
        circle.display();
        System.out.println();

        Rectangle rectangle = new Rectangle(56,78);
        System.out.printf("%.2f \n",rectangle.area());
        rectangle.display();
        System.out.println();

        //Eg2
        Square square = new Square(29);
        System.out.printf("%.2f \n",square.area());
        square.display();
    }
}

abstract class Shape{
    abstract double area();
//    double area(){        //If we comment line 40 and uncomment this section, it will be an abstract class without any abstract methods.
//        return 0.00;
//    }
    void display() {
        System.out.println("Shape got created!!");
    }
}

class Triangle extends Shape{
    double base;
    double height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double area() {
        return 0.5 * base * height;
    }
    void display() {
        System.out.println("Shape Triangle got created.");
    }
}

class Circle extends Shape{
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
}

abstract class Polygon extends Shape{
    abstract double area();
}
class Square extends Polygon{
    double length;
    Square(double length) {
        this.length = length;
    }
    double area() {
        return length * length;
    }
    void display() {
        System.out.println("Shape Square got created.");
    }
}