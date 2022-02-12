// working on this 

import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        initiliseGame();
    }

    public static void initiliseGame() {
        final String INTRO = "-------ROCK PAPER SCISSOR GAME-------";
        System.out.println(INTRO);
        System.out.println("Choose Rock or paper or scissors(r,p,s) : ");

        Scanner scanner = new Scanner(System.in);
        String playerChoice = scanner.next();

        switch (playerChoice) {
            case "r" -> System.out.println("You have chosen Rock, Now CPU will choose!");
            case "p" -> System.out.println("You have chosen Paper, Now CPU will choose!");
            case "s" -> System.out.println("You have chosen Scissor, Now CPU will choose! ");
            default -> System.out.println("Invalid option, please choose (r,p,s) only");
        }
        do {
            Random r = new Random();
            char c = (char) (r.nextInt(26) + 'a');
        } while (c != 'r' || c != 'p' || c != 's')
    }
}
