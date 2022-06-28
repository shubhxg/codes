/* Leetcode Question : Given an array of m x n grid called accounts where
accounts[i][j] is amount of money. ith customer has in jth bank.
return wealth of richest customer 

wealth = the sum of all money he got in all bank accounts
richest customer = max wealth out of all persons
exp:
        person 1 [[1,3,5,1],
        person 2 [4,2],
        person 3 [7,1,1,0],
        person 4 [1,12]]
*/  
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,4,3},
                            {3,4},
                            {0,2,10},
                            {0,31,1,6,2}};
        System.out.println(maxWealth(accounts));

    }
    static int maxWealth(int[][] accounts){

        int richestWealth = 0;

        // each person in accounts 
        for (int[] person : accounts) {
            int sum = 0;

            // money in each account is added to sum 
            for (int moneyInBank : person) {
                sum+=moneyInBank;
            }

            // answer is updated after every persons money is 
            // calculated in variable called sum
            if(sum>richestWealth) {
                richestWealth = sum;
            }
        }
        return richestWealth;
    }
}
