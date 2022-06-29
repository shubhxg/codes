class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7,10,30,42,56};
        int target = 100;
        System.out.println(binarySearch(arr, target));
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;

            // target is bigger than mid element
            if(target > arr[mid])
                start = mid+1;
            // target smaller than mid element
            else if (target < arr[mid])
                end = mid-1;
            // target is at mid position
            else return mid;
        }

        return -1;
    }
}
