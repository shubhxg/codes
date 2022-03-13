import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] array = { 2, 3, 6, 12, 14, 16, 19 };
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    static void reverse(int[] array) {
        int s = 0;
        int e = array.length - 1;

        while (s < e) {
            // swap
            swap(array, s, e);
            s++;
            e--;
        }
    }

    static void swap(int[] array, int s, int e) {
        int temp = array[s];
        array[s] = array[e];
        array[e] = temp;
    }
}
