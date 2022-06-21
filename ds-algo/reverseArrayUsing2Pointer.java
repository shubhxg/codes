import java.util.Arrays;

class Reverse{
    public static void main(String[] args) {
        int array[]={4,3,2,1};
        reverse(array);

        // printing the array
        System.out.println(Arrays.toString(array));
    }

    // reverse using two pointers method
    private static void reverse(int[] array) {
        int s = 0, e = array.length-1;

        while(s<e){
            swap(array, s, e);
            s++;
            e--;
        }
    }
    
    // swap using temp variable
    private static void swap(int[] a, int i1, int i2){
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }
}
