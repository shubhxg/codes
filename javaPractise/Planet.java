import java.util.Scanner;

public class Planet {

    static void printGameInformation(int weight) {
        System.out.println(
                "I have information for the following planets: \n   1. Venus   2. Mars    3. Jupiter \n   4. Saturn  5. Uranus  6. Neptune");
        System.out.println("Which planet are you visiting? ");
        Scanner in = new Scanner(System.in);
        int planetNum = in.nextInt();
        int newWeight = weightCalc(weight, planetNum);
        System.out.printf("Your weight would be " + newWeight + " kilograms on this planet.");
    }

    private static int weightCalc(int weight, int planetNum) {
        switch (planetNum) {
            case 1 -> weight = (int) (0.5 * weight);
            case 2 -> weight = (int) (0.5 * weight);
            case 3 -> weight = (int) (4 * weight);
            case 4 -> weight = (int) (3 * weight);
            case 5 -> weight = (int) (1.05 * weight);
            case 6 -> weight = 2 * weight;
            default -> System.out.println("error : number not found");
        }
        return weight;
    }
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your current earth weight?: ");
        int weight = in.nextInt();
        printGameInformation(weight);
    }
}
