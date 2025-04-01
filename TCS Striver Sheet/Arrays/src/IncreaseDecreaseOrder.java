/*

Problem Statement: Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order

Examples:

Example 1:
Input: 8 7 1 6 5 9
Output: 1 5 6 9 8 7
Explanation: First three elements are in the ascending order and next three elements are in the descending order.

Example 2:
Input: 4 2 8 6 15 5 9 20
Output: 2 4 5 6 20 15 9 8

*/

import java.util.Arrays;
import java.util.Scanner;

public class IncreaseDecreaseOrder
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        compute(arr,n);

    }

    private static void compute(int[] arr, int n)
    {
        Arrays.sort(arr);

        for(int i=0;i<n/2;i++)
            System.out.print(arr[i]+ " ");

        for(int i=n-1;i>=n/2;i--)
            System.out.print(arr[i]+ " ");
    }
}
