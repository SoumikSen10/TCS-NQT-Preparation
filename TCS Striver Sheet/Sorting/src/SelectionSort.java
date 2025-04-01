/*

Problem Statement: Given an array of N integers, write a program to implement the Selection sorting algorithm.

Examples:

Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

Example 2:
Input: N=5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting the array is: 1, 2, 3, 4, 5

*/

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort
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

        System.out.println(Arrays.toString(arr));

        selectionSort(arr,n);

        System.out.println(Arrays.toString(arr));

    }

    private static void selectionSort(int[] arr,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            if(i!=min)
            {
                int temp = arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }
}
