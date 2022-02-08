import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short number = scanner.nextShort();
        final int result = number % 2 == 0 ? number + 2 : number + 1;
        System.out.println(result);
    }
}
