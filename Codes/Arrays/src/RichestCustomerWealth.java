public class RichestCustomerWealth {
    public static void main(String[] args) {
        //Ques: Richest Customer Wealth ** Leetcode-1672
        int[][] accounts = {{1, 4, 3},{3, 2, 1}};
        int m = accounts.length;

        int ans = max_wealth(accounts,m);       //calling the method
        System.out.println("the max wealth is : "+ans);

    }

    static int max_wealth(int[][] accounts, int m) {
        int max = 0;
        //row == person
        //col == account
        //arr == accounts
        for (int person = 0; person< m; person++) {
            int wealth_sum = 0;//here every time it iterate for new col the sum becomes 0 ,so it can calculate individual sum of the rows to check
            for (int account = 0; account<accounts[person].length; account++) {
                wealth_sum += accounts[person][account]; //here storing sum value
            }
            if ( wealth_sum>max) {
                max = wealth_sum; //comparing the max sum of rows
            }
        }
        return max;     //return max wealth
    }
}
