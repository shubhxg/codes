// import java.util.*;  
class Main {
    public static void main(String[] args) {        
        //matrix addition program
        int[][] arr1 = {{1,2,3},
                        {2,4,6}};
        int[][] arr2 = {{4,3,3},
                        {2,2,2}};
        int[][] sum = {{0,0,0},{0,0,0}};

        for(int i= 0; i<arr1.length; i++) {
            for(int j= 0; j<arr2[i].length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int i= 0; i<arr1.length; i++) {
            for(int j= 0; j<arr2[i].length; j++) {
                System.out.print(sum[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
