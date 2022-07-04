public class FindCeilingUsingBS {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 7, 9, 12, 14 };
        int target = 16;
        System.out.println(ceilingFind(arr, target));
    }

    // returns the ceiling of the target number
    static int ceilingFind(int[] arr, int target) {
        int s = 0, e = arr.length - 1;

        // target is biggest number in array
        if (target > arr[arr.length - 1])
            return -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // if element found at mid returns the index
            if (arr[mid] == target)
                return mid;
          
            if (target < arr[mid])
                e = mid - 1;
            else
                s = mid + 1;
        }
        // returns ceiling of target
        return s;
    }
}
