public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        
        car.go();
        bike.stop();
        System.out.println("Total speed of both vehicles = " + (car.speed + bike.speed));
    }
}

class Vehicle { 

    //super class - Parent class
    double speed = 100;

    void go() {
        System.out.println("\nthis vehicle is moving...");

    }
    void stop() {
        System.out.println("\nthis vehicle has stopped!");
        
    }

} 

class Bike extends Vehicle{ 
    // inherited from vehicle class
    
    //overridding speed variable
    double speed = 60;

}

class Car extends Vehicle{
     // inherited from vehicle class

}
