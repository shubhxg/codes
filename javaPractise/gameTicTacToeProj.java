import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        // driver method
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}}; 
            
        //player or computer
        String user = "player";
        printGameboard(gameBoard);  

        System.out.println("Enter your placement (1-9): ");
        Scanner scan = new Scanner(System.in);
        int pos = scan.nextInt();
        System.out.println(pos);
        scan.close();

        //placing the piece
        placePiece(gameBoard, pos, user);
        //calling function to print gameboard again
        printGameboard(gameBoard);
    }
    //function to print gameboard
    public static void printGameboard(char[][] gameBoard){
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    //function to place pieces
    public static void placePiece(char[][] gameBoard, int pos, String user) {
         //switch case to put the board placements
         char symbol = ' ';
         if(user.equals("player")){
            symbol = 'x';
         } else if(user.equals("cpu")) {
            symbol = 'o';
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
}
