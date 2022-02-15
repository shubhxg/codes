import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        // driver code
        initiliseGame();
    }

    public static void initiliseGame() {
        
        // game logic
        final String INTRO = "-------ROCK PAPER SCISSOR GAME-------";
        System.out.println(INTRO);

        Scanner scanner = new Scanner(System.in);
        String myMove = "";
        int wins = 0, losses = 0;

        // game loop
        while (true) {
            System.out.print("Enter your move. Type in rock, paper or scissor. If you want to exit the game, type in exit : ");
            myMove = scanner.next();

            //checking if user entered exit
            if (myMove.equals("exit")) {
                break;
            }

            if (!myMove.equalsIgnoreCase("rock") && !myMove.equalsIgnoreCase("paper") && !myMove.equalsIgnoreCase("scissor")
                    && !myMove.equalsIgnoreCase("exit")) {
                System.out.println("Invalid move");
            } else {

                // Randomly generate cpu move between 0,1,2
                int rand = (int) (Math.random() * 3);
                String cpuMove = "";

                if (rand == 0) {
                    cpuMove = "rock";
                } else if (rand == 1) {
                    cpuMove = "paper";
                } else {
                    cpuMove = "scissor";
                }
                System.out.println("CPU move is : " + cpuMove);

                // game logic
                if (myMove.equalsIgnoreCase(cpuMove)) {
                    System.out.println("Tied!\n");
                } else if ((myMove.equalsIgnoreCase("rock") && (cpuMove.equalsIgnoreCase("scissor"))) ||
                        (myMove.equalsIgnoreCase("scissors") && cpuMove.equals("paper")) ||
                        (myMove.equalsIgnoreCase("paper") && cpuMove.equalsIgnoreCase("rock"))) {
                    System.out.println("You won!\n");
                    ++wins;
                } else {
                    System.out.println("You lost!\n");
                    ++losses;
                }
            }

        }
        System.out.println("Thanks for playing :)");
        System.out.println("You won " + wins + " times and lost " + losses + " times.");
    }

}
