public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = { 1, 4, 6, 7, 9, 12, 14 };
        int[] arr = { 19, 12, 9, -1, -3 };
        int target = -1;
        System.out.println(orderAgnosticBS(arr, target));
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int s = 0, e = arr.length - 1;

        // assigns true if array is ascending order and false if descending.
        boolean isAsc = arr[s] < arr[e];
        while (s <= e) {
            int mid = s + (e - s) / 2;

            // if element found at mid return the index
            if (arr[mid] == target)
                return mid;

            if (isAsc) {
                // array is in ascending order 
                if (target < arr[mid])
                    e = mid - 1;
                else
                    s = mid + 1;
            } else {
                // array is in descending order 
                if (target > arr[mid])
                    e = mid - 1;
                else
                    s = mid + 1;
            }
        }
        return -1;
    }
}
