package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creating animal object of animal class.
        Animal animal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("what animal do you want? \n1. Dog 2. Cat");
        int var = scanner.nextInt();

        // prompt for user to ask for creating particular object 
        // dynamic polymorphism here (runtime polymorphism)
        
        if (var == 1) {
            animal = new Dog();
            animal.speak();
        } else if (var == 2){
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("That choice was invalid");
            animal.speak();
        }
        
        scanner.close();
    }
}

// creating Animal class.
class Animal {

    public void speak() {
        System.out.println("random animal making noise");
    }
}

// creating Dog child class of Animal class
class Dog extends Animal {

    @Override       // overloaded method (function)
    public void speak() {
        System.out.println("bark.");
    }
}

// creating Cat child class of Animal class
class Cat extends Animal {

    @Override       // overloaded method (function)
    public void speak() {
        System.out.println("Meowww.");
    }
}
