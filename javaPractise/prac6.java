import java.util.Scanner;
//jetbrains academy problem
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        final int one = 1;
        final int two = 2;
        final int three = 3;
        int result = ((number + one) * number + two) * number + three;
        System.out.println(result);
    }
}
