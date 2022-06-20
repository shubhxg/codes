import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), col = sc.nextInt(); 

        int[][] arr = new int[row][col];

        // input
        for(int i=0; i<row; i++){
            for (int j = 0; j<col; j++) {
                arr[i][j] = sc.nextInt();
            }    
        }
        int x = sc.nextInt();
        for(int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if(arr[i][j] == x) {
                    System.out.println(i + " " + j);
                }
            }
        }
        
        sc.close();
    }
    
}
