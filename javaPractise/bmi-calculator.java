package com;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //prompt for user to enter weight in pounds
        System.out.println("Enter your weight in pounds :");
        double weight = scanner.nextDouble();

        //promt to enter height in inches.
        System.out.println("Enter your height in inches :");
        double height = scanner.nextDouble();

        // constants 
        final double KILOGRAMS_PER_POUND = 0.453f;
        final double METERS_PER_INCH = 0.0254f;

        // compute bmi
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / 
            (heightInMeters * heightInMeters);

        //displayinh result
        System.out.printf("bmi is %.2f \n", bmi);
        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi > 18.5 && bmi < 25) {
            System.out.println("normal");
        } else if (bmi > 25 && bmi < 30) {
            System.out.println("overweight");
        } else {
            System.out.println("obese");
        }

    }
}
