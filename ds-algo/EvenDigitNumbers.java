// Array = {1,21,14,167,9210}
// return the frequency of numbers with even digits in it.
// output here is 3

public class EvenDigitsNumbers {
    public static void main(String[] args) {
        int nums[] = {1,21,14,167,9210};
        System.out.println(findFrequency(nums));
    }

    // function to find numbers with even digits
    static int findFrequency(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (hasEvenNumOfDigits(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digit 
    private static boolean hasEvenNumOfDigits(int num) {
        int n = findNumofDigits(num);
        // checking if number has even digits
        return (n%2==0);
    }

    private static int findNumofDigits(int num) {
        // if number is negative
        if(num<0)
            num*=-1;

        // if number is 0
        if(num==0)
            return 1;
        
        // returns the number of digits in a number
        return (int)(Math.log10(num)+1);
    }
}
