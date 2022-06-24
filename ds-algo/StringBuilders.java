import java.util.Scanner;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        try (Scanner sc = new Scanner(System.in)) {
            // loop to get the input of the characters for string
            for (int i = 0; i < 4; i++) {
                sb.append(sc.next());
            }
        }

        //printing the string
        System.out.println(sb);
        
    }
}
