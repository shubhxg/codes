import java.util.Scanner;

// import java.util.*;  
class Main {
    public static void main(String[] args) {        
        int[] array = {1,5,6,6,2,3,4,5,6,6,7,8,9,10};
        int num, count = 0;
        Scanner inputFromUser = new Scanner(System.in);
        num = inputFromUser.nextByte();
        inputFromUser.close();
        boolean isInArray = false;
        //linear search basically
        for (int i : array) {
            if (num == i) {
                isInArray = true;
                count++;
            }
        }
        if (isInArray)
            System.out.println("Found!"+count+" times");
        else
            System.out.println("not Found!");
    }
}
