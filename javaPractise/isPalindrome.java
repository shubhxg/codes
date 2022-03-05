import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();

        int low = 0, high = s.length() - 1;
        
        boolean isPalindrome = true;
        while (low<high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if (isPalindrome) {
            System.out.println("yes its a palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }   
}
