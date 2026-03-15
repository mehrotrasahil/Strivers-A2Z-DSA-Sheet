package Arrays.Medium;

/* 

Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Examples
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note: That buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

*/
public class StockBuySell {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };

        optimalApproach(arr);
        int maxProfit = calculateMaxProfite(arr);
        System.out.println(maxProfit);
    }

    static int calculateMaxProfite(int[] arr) {
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] > maxProfit) {
                    maxProfit = arr[j] - arr[i];
                }
            }
        }
        return maxProfit;
    }

    static void optimalApproach(int[] arr) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            } else {
                maxProfit = Math.max(maxProfit, arr[i] - minPrice);
            }
        }
        System.out.println(maxProfit);
    }
}
