package oopsconcept;

public class InheritanceEg3 {
    public static void main(String[] args) {
        Plant plant1 = new Plant(true, false);
        System.out.println("Is Plant Alive : " + plant1.isAlive);
        System.out.println("Bloom Flowers : " + plant1.bloomFlowers);
        plant1.photosynthesis();
        System.out.println();

        Animalss animal1 = new Animalss(true, true);
        System.out.println("Is Animal Alive : " + animal1.isAlive);
        animal1.info();
        animal1.makesSound();
        System.out.println();

        Doggy dog = new Doggy(false, true,"Tyson");
        System.out.println("Is Dog Alive : " + dog.isAlive);
        dog.info();
        dog.makesSound();
    }
}

class Organism {
    boolean isAlive;

    Organism() {
        isAlive = true;
    }
}

// Organism -> Plant
class Plant extends Organism{
    boolean bloomFlowers;
    boolean sunlight;

    Plant(boolean bloomFlowers, boolean sunlight) {
        this.bloomFlowers = bloomFlowers;
        this.sunlight = sunlight;
    }
    void photosynthesis() {
        if(sunlight)
            System.out.println("Photosynthesis possible.");
        else
            System.out.println("Photosynthesis not possible.");
    }
}

//Organism -> Animalss
class Animalss extends Organism {
    boolean isHerbivore;
    boolean isPet;

    Animalss(boolean isHerbivore, boolean isPet) {
        this.isHerbivore = isHerbivore;
        this.isPet = isPet;
    }

    void info() {
        if (isHerbivore)
            System.out.println("Herbivore");
        else
            System.out.println("Carnivore");
        if (isPet)
            System.out.println("Pet Animal");
        else
            System.out.println("Wild Animal");
    }

    void makesSound() {
        System.out.println("Animals makes sound.");
    }
}

//Organism -> Animalss -> Dog
class Doggy extends Animalss{
    String name;

    Doggy(boolean isHerbivore, boolean isPet, String name) {
        super(isHerbivore, isPet);
        this.name = name;
    }

    //Method Overriding
    @Override
    void makesSound() {
        System.out.println("The dog goes *woof*");
    }
}