import java.util.*;  
class prac {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        // number of elements
        final int four = 4;
        int nElements = scanner.nextInt(); 
        // max
        int max = Integer.MIN_VALUE; 
        // array of elements
        int[] arr = new int[nElements];
        // reading elements
        for (int i = 0; i < nElements; ++i) {
            arr[i] = scanner.nextInt();
        }
        // finding the max4 element 
        for (int i = 0; i < nElements; ++i) { 
            if (arr[i] % four == 0 && arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
