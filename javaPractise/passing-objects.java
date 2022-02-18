class Main {
    public static void main(String[] args) {
        // creating car objects of type Car
        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        // creating garage object of type Garage
        Garage garage = new Garage();
        // sending cars to the garage park method
        garage.park(car1);
        garage.park(car2);

    }
}

class Car {
    String name;

    // constructing Car object
    Car(String name) {
        this.name = name;
    }
}

class Garage {

    // park method of Garage class taking Car object named car
    void park(Car car) {
        System.out.println("You parked your car " + car.name);
    }
}
