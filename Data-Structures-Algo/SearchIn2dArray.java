import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {
        
        int[][] array = {{11,102}, 
            {21,42,12,42,21}, 
            {12,21}, 
            {46,21,31,13,52,21}
        };
        int target = 31;

        // returning the position of the element in array
        int[] pos = search(array, target);
        System.out.println(Arrays.toString(pos));
    }

    static int[] search(int[][] array, int target) {

        // if array is empty return -1 in a new array
        if(array.length == 0) return new int[]{-1};

        // returning the positions of index in a new array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == target) return new int[]{i,j};
            }
            
        }
        // if not found return -1 in new array
        return new int[]{-1};
    }
}
