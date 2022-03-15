class Leetcode2 {
    // https://leetcode.com/problems/richest-customer-wealth/
    public static void main(String[] args) {
        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] array) {

        // initialising maxsofar with minimum value
        int maxSoFar = 0;

        // iterating over array
        for (int[] i : array) {
            // for each row initialising sum to 0
            int thisRowMax = 0;
            for (int j : i) {
                thisRowMax += j;
            }
            // Update the max value so far seen if the current value is greater
            // If it is less than the thisent sum
            maxSoFar = Math.max(maxSoFar, thisRowMax);

        }
        // returning the max wealth
        return maxSoFar;
    }
}
