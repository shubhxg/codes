import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
      
        // initialising arraylist
        ArrayList<Integer> list = new ArrayList<>(5);
        
        //function to add elements
        addElements(list,5);

        // printing the elements
        System.out.println(list);

        // removed index 1
        list.remove(1);
        System.out.println(list);

    }

    private static void addElements(ArrayList<Integer> list, int s) {

        // adding elements in list
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0; i<s; i++){
                list.add(i, sc.nextInt());
            }
        }   

    }
}
