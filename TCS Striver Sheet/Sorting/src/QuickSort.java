/*

Problem Statement:  Given an array of n integers, sort the array using the Quicksort method.

Examples:

Example 1:
Input:  N = 5  , Arr[] = {4,1,7,9,3}
Output: 1 3 4 7 9

Explanation: After sorting the array becomes 1, 3, 4, 7, 9

Example 2:
Input: N = 8 , Arr[] = {4,6,2,5,7,9,1,3}
Output: 1 2 3 4 5 6 7 9
Explanation: After sorting the array becomes 1, 3, 4, 7, 9

*/

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort
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

        quickSort(arr,n);

        System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int[] arr,int n)
    {
        quickSort(arr,0,n-1);
    }

    private static void quickSort(int[] arr,int low,int high)
    {
       if(low<high)
       {
           int pIndex = partition(arr,low,high);
           quickSort(arr,low,pIndex-1);
           quickSort(arr,pIndex+1,high);
       }
    }

    private static int partition(int[] arr,int low,int high)
    {
        int pivot = arr[low];
        int i = low, j = high;

        while(i<j)
        {
            while(arr[i]<=pivot && i<=high-1)
                i++;

            while(arr[j]>pivot && j>=low+1)
                j--;

            if(i<j)
            {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j; //partition index

    }
}
