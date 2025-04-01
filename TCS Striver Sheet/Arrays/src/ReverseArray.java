/*

Problem Statement: You are given an array. The task is to reverse the array and print it.

Examples:

Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

Example 2:
Input: N=4 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

*/

import java.util.Scanner;

public class ReverseArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

        System.out.println();

        reverse(arr,n);

        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }

    private static void reverse(int[] arr,int n)
    {
        int start=0,end=n-1;

        while(start<end)
        {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
}
