package oopsconcept;

/**
 * Composition represents a "part-of" relationships between Objects.
 * Eg : An Engine is a part of a Car.
 * It allows complex objects to be constructed from smaller objects.
 */
public class CompositionEg {
    public static void main(String[] args) {
        Cars car = new Cars("Verna", 2022, "v8");
        System.out.println(car);;
    }
}

class Cars {
    String model;
    int make;
    Engine engine;
    Cars(String model, int make, String engineType) {
        this.model = model;
        this.make = make;
        this.engine = new Engine(engineType);
    }
    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", make=" + make +
                ", engine=" + engine.type +
                '}';
    }
}
class Engine {
    String type;
    Engine(String type) {
        this.type = type;
    }
}
