/*

Bob is going to bet today on horse riding. There are N horses listed in a sequence of 1 to N.

The probability of winning of each horse is different so the prices for making a bet on the horses are not the same. There is no limit on the number of horses on which he can bet, but he thinks that if he bets on continuous sequence of horses then he has better chance of win.

Bob will get K units of money if any horse on which he bets will win. But as the award is only k units so he wants to put money less than K. Bob wants to bet as many horses as he can.

Please help Bob to find out the length of maximum continuous sequence of horses on which bob can place bet and remember he will invest money less than K.

If there are more than 1 possible combinations bob will bet randomly on any one of them.

Example 1 :

Input :
10 --> horses
100 --> k
30 40 50 20 20 10 90 10 10 10

Output :
3

Example 2 :

Input :
10
100
10 90 80 20 90 60 40 60 70 75

Output :
1

*/

import java.util.Scanner;

public class BobHorseRiding
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        int ans = findSequenceLength(arr,n,k);
        System.out.print(ans);
    }

    private static int findSequenceLength(int[] arr,int n,int k)
    {
        int sum = 0,maxLen=0,i=0,j=0;

        while(j<n)
        {
            sum = sum + arr[j];

            while(sum >= k && i<=j)
            {
                sum = sum - arr[i];
                i++;
            }

            maxLen = Math.max(maxLen,j-i+1);

            j++;

        }
        return maxLen;
    }
}
