import java.util.Random;
import java.util.Scanner;

// import java.util.*;  
class guessingGame {
	public static void main(String[] args) {
		initialiseGame();

	}

	public static void initialiseGame() {
		final int x = 1, y = 6;

		while (true) {

			System.out.println("\nWelcome to guessing the number game!, enter a between 1 - 5");
			System.out.println("If you guess it right, you win!");
			Scanner scanner = new Scanner(System.in);
			int userNumber = scanner.nextInt();

			// randomly creates numbers between given range
			Random random = new Random();
			int cpuNumber = random.nextInt(x, y);
			// checking if user input is equal to cpu number
			if (userNumber == cpuNumber) {
				System.out.println("Congratulations you won!");
			} else {
				System.out.println("Sorry you lost! cpu number was " + cpuNumber);
			}
		}
	}
}
