public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] a = {23,12,2,13,4,12,321,3,42,14,91};
        int target = 100;
        final int START = 0;
        final int END = 6;
        System.out.println(linearSearchInRange(a, target, START, END));
    }

    static int  linearSearchInRange(int[] a, int t, int s, int e){
        // if array is empty
        if (a.length == 0) return -1;
      
      //checks at every index if i == target
        for (int i = s; i < e; i++) {
            if (a[i] == t) return i;
        }
      
        // if target is not found
        return -1; 
    }
}
