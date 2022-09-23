class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7,10,30,42,56};
        int target = 100;
        System.out.println(binarySearch(arr, target, 0, array.length));
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start<=end) {
            int mid = start+(end-start)/2;
            
//             checking at mid
            if(array[mid] == key) return mid;

//             checking in first half of array
            if(key < array[mid]) end = mid-1;
//             checking second half of array
            else start = mid + 1;
        }
//         not found 
        return -1;
    }
}
