/*

Problem Statement: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.

Examples:

Example 1:
Input: N = 5, array[] = {1,2,3,4,5} K=2
Output: {3,4,5,1,2}
Explanation: Rotate the array to right by 2 elements.

Example 2:
Input: N = 7, array[] = {1,2,3,4,5,6,7} K=3
Output: {4,5,6,7,1,2,3}
Explanation: Rotate the array to right by 3 elements.

*/

import java.util.Scanner;

public class RotateKElements
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int k = in.nextInt();

        k=k%n;

        System.out.println(k);

        rotate(arr,0,n-1,k-1);

        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }

    private static void rotate(int[] arr,int start, int end, int k)
    {
        if(k==0 || k==end)
            return;

        rotateHelper(arr,start,k);
        rotateHelper(arr,k+1,end);
        rotateHelper(arr,start,end);
    }

    private static void rotateHelper(int[] arr,int start,int end)
    {
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
}
