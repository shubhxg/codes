public class MinNumberFinderInArray {
    public static void main(String[] args) {
        int[] a = {4,1,2,3,6,1,2,1};
        System.out.println(minFinder(a));
    }

    static int minFinder(int[] a) {
        // initialising min with 0th value
        int min = Integer.MAX_VALUE; // or a = a[0]
        
        
        // if array is empty
        if(a.length == 0) return -1;

        // iterating i to find minimum number
        for (int i = 0; i < a.length; i++) {
            if(min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
}
