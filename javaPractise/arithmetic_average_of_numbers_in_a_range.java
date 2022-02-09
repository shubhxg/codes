//Write a program that reads two numbers aa and bb from the keyboard and calculates and outputs to the console the arithmetic average of all numbers 
// from the interval [a; b][a;b], which are divisible by 3.

import java.util.*;  
class prac {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var sum = 0;
        double resultAvg = 0; 
        int counterForNums = 0;
        
        for(int i = a; i <= b; ++i) {
            if (i % 3 == 0) {
                sum += i;
                ++counterForNums;
            }
        }
        resultAvg = sum / (double) counterForNums;
        System.out.println(resultAvg);
    }
}
