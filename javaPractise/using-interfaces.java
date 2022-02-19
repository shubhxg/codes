//interface is a template that can be applied
// to a class its simlar to inheritance but s[ecifies 
// what a class must do.
//classes can apply more than 1 interfaces.

public class Main {
    public static void main(String[] args) {

        System.out.println();
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();

    }

}

class Rabbit implements Prey {

    @Override
    public void flee() {
        System.out.println("rabbit is fleeing");
    }

}

class Hawk implements Predator {

    @Override
    public void hunt() {

        System.out.println("hawk is hunting.");
    }

}

class Fish implements Prey, Predator {

    // fish can be a predator or a prey as well
    // eg- big sharks eat small fish
    @Override
    public void hunt() {
        System.out.println("Big fish is hunting.");

    }

    @Override
    public void flee() {
        System.out.println("Small fish is fleeing.");

    }

}

interface Prey {

    void flee();

}

interface Predator {

    void hunt();

}
