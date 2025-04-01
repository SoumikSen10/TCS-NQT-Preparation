/*

Vijay an industrialist recently opened a fuel industry. There are N number of different category of fuels and each fuel is stored in a fixed size container. Size of each container can vary from fuel to fuel.

Hari, a fuel merchant, visited Vijay's industry and he wanted to purchase fuels for his shop. Hari has a limited amount of money (K) and wants to buy fuel. Hari will not buy more than one container of any fuel category. Hari wants to maximize the overall volume i.e. sum of volume of fuels he buys. Your task is to get the maximum overall volume of fuels which Hari can purchase.

Given the number of categories of fuels (N) money units (k) price of container of each category of fuel and volume contained in container for each category.

Note : Quantity (Volume) of container will be given in the same order as of the price.

Example 1 :

Input :
5
105
10 10 40 50 90 --> prices
10 20 20 50 150 --> container

Output :
170  --> (20 + 150)

Example 2 :

Input :
5
100
10 20 30 40 100
10 20 30 40 100

Output :
100

*/

import java.util.Scanner;

public class FuelIndustry
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int prices[] = new int[n];
        int quantities[] = new int[n];

        for(int i=0;i<n;i++)
            prices[i] = in.nextInt();

        for(int i=0;i<n;i++)
            quantities[i] = in.nextInt();

        int ans = maxQuantity(prices,quantities,k,n);
        System.out.print(ans);
    }

    private static int maxQuantity(int[] prices,int[] quantities,int k,int n)
    {
        int[][] dp = new int[n + 1][k + 1];  // DP table initialize

        for (int i = 1; i <= n; i++) {  // Fuel items
            for (int j = 0; j <= k; j++) {  // Budget
                if (j - prices[i - 1] >= 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - prices[i - 1]] + quantities[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][k];  // Maximum volume possible
    }
}
