import java.util.Scanner;

class tictactoePrac {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        var string = scanner.nextLine();
        String top = "---------";
        String front = "| ";
        String back = " |";
        scanner.close();
        System.out.println(top);
        System.out.println(front + string.charAt(0) + " " 
            + string.charAt(1) + " " + string.charAt(2) + back);
        System.out.println(front + string.charAt(3) + " " 
            + string.charAt(4) + " " + string.charAt(5) + back);
        System.out.println(front + string.charAt(6) + " " 
            + string.charAt(7) + " " + string.charAt(8) + back);
        System.out.println(top);
    }
}
