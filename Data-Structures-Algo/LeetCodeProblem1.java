import java.util.Scanner;

// given in an array return how many numbers have even number of digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class Leetcode1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = { 12, 435, 12, 13, 7618 };
        System.out.println(findEvenNumbers(nums));
        scanner.close();
    }

    // function to count numbers with even number of digits
    static int findEvenNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (even(i)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num) {
        int nofDigits = digits(num);
        return (nofDigits % 2 == 0);
    }

    // function to count the number of digits
    static int digits(int num) {
        // condition if number is negative
        if (num < 0) {
            num = num * -1;
        }
        // condition if number is 0
        if (num == 0) {
            return 1;
        }

        return (int)(Math.log10(num) + 1);
    }
}
