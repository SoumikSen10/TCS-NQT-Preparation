/*

Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1 :

Input :
nums = -2 1 -3 4 -1 2 1 -5 4

Output : 6

Explanation : The subarray [4,-1,2,1] has the largest sum 6.

*/

import java.util.Scanner;

public class LargestSubarraySum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        int ans = findLargestSum(arr,n);
        System.out.print(ans);
    }

    // Kadane's Algorithm
    private static int findLargestSum(int[] arr, int n)
    {
        int sum = 0,maxSum = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            sum = sum + arr[i];
            maxSum = Math.max(sum,maxSum);
            if(sum<0)
                sum = 0;
        }

        return maxSum;
    }
}
