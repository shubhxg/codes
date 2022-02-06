// import java.util.*;  
class java {
    public static void main(String[] args) {        
        int[] arr = {1,2,4,6,8,2,3,1};
        boolean isSorted = true;
        for (int i = 0; i<arr.length; i++) {
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
