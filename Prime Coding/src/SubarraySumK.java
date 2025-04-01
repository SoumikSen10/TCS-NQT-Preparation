/*

Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

Example :

Input :
nums = 1 2 3 -3 1 1 1
k=3

Output :
6

*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubarraySumK
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        int k = in.nextInt();

        int ans = countKOptimized(arr,n,k);
        System.out.print(ans);
    }

    private static int countK(int[] arr, int n, int k)
    {
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            int sum = 0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum==k)
                    cnt++;
            }
        }

        return cnt;
    }

    private static int countKOptimized(int[] arr,int n, int k)
    {
        int cnt = 0, prevSum = 0;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i=0;i<n;i++)
        {
           prevSum = prevSum + arr[i];
           int remaining = prevSum - k;
           cnt = cnt + map.getOrDefault(remaining,0);
           map.put(prevSum,map.getOrDefault(prevSum,0)+1);
        }

        return cnt;
    }
}
