/*

Problem Statement: Given an unsorted array, find the median of the given array.

Examples:

Example 1:
Input: [2,4,1,3,5]
Output: 3

Example 2:
Input: [2,5,1,7]
Output: 3.5

*/

import java.util.Scanner;
import java.util.Arrays;

public class MedianArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        double median = findMedian(arr,n);
        System.out.printf("%.1f",median);
    }

    private static double findMedian(int[] arr,int n)
    {
        Arrays.sort(arr);

        double median;

        if(n%2!=0)
        {
            median = arr[n/2];
        }
        else
        {
            int mid = n/2;
            median = (double)(arr[mid-1] + arr[mid])/2;
        }

        return median;
    }
}
