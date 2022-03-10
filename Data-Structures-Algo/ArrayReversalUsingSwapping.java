/* 
Array reversal using temporary variable
this method is 40ms faster than the Collections.FunctionName(Arrays.aslist()) which means this one is more efficient for big data.
average time - 210ms 
*/

public class Main{
  
    // function swaps the array's first element with last
    // element, second element with last second element and
    // so on
    static void reverse(int a[], int n)
    {
        int temp = 0;
        for (int i = 0; i < n / 2; i++) {
            temp = a[i];          //putting ith element in temp
            a[i] = a[n - i - 1]; //putting n-i-1 th element in ith position of array
            a[n - i - 1] = temp; // putting the temp value to n - i - 1 th element
	}
        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

		public static void main(String[] args)
    {
        int[] arr = { 10, 20, 30, 40, 50 };
        reverse(arr, arr.length);
    }
}
