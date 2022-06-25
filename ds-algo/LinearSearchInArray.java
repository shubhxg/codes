import java.util.Scanner;
import java.util.Arrays;

public class LinearSearchInArray {
    public static void main(String[] args) {
        int[] arr = new int[5];

        // calling function for input
        int element = getElements(arr, arr.length);
        System.out.println(Arrays.toString(arr));

        // calling function to search
        int result = linearSearch(arr, arr.length, element);
        System.out.println(result + " pos");
    }

    private static int linearSearch(int[] arr, int length, int element) {

        // if no element in array
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i + 1;
            }
        }

        // if not found then
        return -1;
    }

    private static int getElements(int[] arr, int l) {
        try (Scanner sc = new Scanner(System.in)) {
            // taking input elements
            for (int i = 0; i < l; i++) {
                arr[i] = sc.nextInt();
            }

            // taking element to search
            int e = sc.nextInt();
            return e;
        }
    }
}
