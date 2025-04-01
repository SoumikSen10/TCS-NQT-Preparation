/*

Problem Statement: Given an array, we have to find the smallest element in the array.

Examples:

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 0
Explanation: 0 is the smallest element in the array.

Example2:
Input: arr[] = {8,10,5,7,9};
Output: 5
Explanation: 5 is the smallest element in the array.

*/

import java.util.Scanner;

public class SmallestNo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        int small = smallest(arr,n);
        System.out.print(small);
    }

    private static int smallest(int[] arr,int n)
    {
        int mini = arr[0];

        for(int i=1;i<n;i++)
        {
            mini = Math.min(mini,arr[i]);
        }

        return mini;
    }

}
