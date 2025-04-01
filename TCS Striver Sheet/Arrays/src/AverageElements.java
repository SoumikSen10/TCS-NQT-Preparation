/*

Problem Statement: Given an array, we have to find the average of all the elements in the array.

Examples:

Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 3
Explanation: Average is the sum of all the elements divided by number of elements. Therefore (1+2+3+4+5)/5 = 3.

Example 2:
Input:  N=6, array[] = {1,2,1,1,5,1}
Output: 1.8
Explanation: Average is the sum of all the elements divided by number of elements. Therefore (1+2+1+1+5+1)/6 = 1.8

*/

import java.util.Scanner;

public class AverageElements
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        double avg = average(arr,n);
        System.out.printf("%.2f",avg);

    }

    private static double average(int[] arr,int n)
    {
        double avg=0.0;
        double sum=0.0;

        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }

        avg=sum/n;

        return avg;
    }
}
