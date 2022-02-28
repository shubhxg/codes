import java.util.Random;
import java.util.Scanner;

class Game {
        public int number;
        public int input_number;
        public int number_of_guess = 0;

        public int getNumberOfGuesses() {
                return number_of_guess;
        }

        public void setNumberOfGuesses(int number_of_guess) {
                this.number_of_guess = number_of_guess;
        }

        Game() {
                Random rand = new Random();
                this.number = rand.nextInt(50);
        }

        void takeUserInput() {
                System.out.println("guess the number: ");
                Scanner scanner = new Scanner(System.in);
                input_number = scanner.nextInt();
        }

        boolean isCorrectNumber() {
                ++number_of_guess;
                if (input_number == number) {
                        System.out.println("You won in " + number_of_guess + " times!");
                        return true;
                } else if (input_number < number) {
                        System.out.println("too less");
                } else if (input_number > number) {
                        System.out.println("too high");
                }
                return false;
        }
}

class Main {
        public static void main(String[] args) {
                Game g = new Game();
                boolean bool = false;
                while(!bool) {
                g.takeUserInput();
                bool = g.isCorrectNumber();
                }


        }
}
