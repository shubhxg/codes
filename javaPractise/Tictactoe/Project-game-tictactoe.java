import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// ✅ - methods starting

public class tictactoe {

    // arraylist to store the winning positions of player and cpu
    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static void main(String[] args) {
        // driver method
        char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' },
                { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' },
                { ' ', '|', ' ', '|', ' ' } };

        printGameboard(gameBoard);

        // looping through the game
        while (true) {
            // user prompt to enter the piece place
            System.out.println("Enter your placement (1-9): ");
            Scanner scan = new Scanner(System.in);
            int playerPos = scan.nextInt();
            while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)) {
                System.out.println("Position taken! Enter other position:");
                playerPos = scan.nextInt();
            }

            // calling funciton to placing the piece
            placePiece(gameBoard, playerPos, "player");

            String result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

            // putting random cpu position
            Random randm = new Random();
            int cpuPos = randm.nextInt(9) + 1;
            while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
                cpuPos = randm.nextInt(9) + 1;
            }
            placePiece(gameBoard, cpuPos, "cpu");

            // calling function to print gameboard again
            printGameboard(gameBoard);

            // printing results
            result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }
            System.out.println(result);
        }
    }

    // function to print gameboard ✅
    public static void printGameboard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    // function to place pieces ✅
    public static void placePiece(char[][] gameBoard, int pos, String user) {
        // switch case to put the board placements
        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'x';
            playerPositions.add(pos);
        } else if (user.equals("cpu")) {
            symbol = 'o';
            cpuPositions.add(pos);
        }

        switch (pos) {
            case 1 -> gameBoard[0][0] = symbol;
            case 2 -> gameBoard[0][2] = symbol;
            case 3 -> gameBoard[0][4] = symbol;
            case 4 -> gameBoard[2][0] = symbol;
            case 5 -> gameBoard[2][2] = symbol;
            case 6 -> gameBoard[2][4] = symbol;
            case 7 -> gameBoard[4][0] = symbol;
            case 8 -> gameBoard[4][2] = symbol;
            case 9 -> gameBoard[4][4] = symbol;
            default -> System.out.println("wrong input");
        }
    }

    // function to check winner ✅
    public static String checkWinner() {

        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        // columns list
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        // diagonal list
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(3, 5, 7);

        List<List> winningCondition = new ArrayList<List>();
        winningCondition.add(topRow);
        winningCondition.add(midRow);
        winningCondition.add(botRow);
        winningCondition.add(leftCol);
        winningCondition.add(rightCol);
        winningCondition.add(midCol);
        winningCondition.add(cross1);
        winningCondition.add(cross2);

        for (List l : winningCondition) {
            if (playerPositions.containsAll(l)) {
                return "Congratulations you Won!";
            } else if (cpuPositions.containsAll(l)) {
                return "Cpu Wins! :(";
            }
        }
        if (playerPositions.size() + cpuPositions.size() == 9) {
            return "Draw";
        }
        return "";
    }
}
