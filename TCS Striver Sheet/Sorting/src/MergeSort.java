/*

Problem:  Given an array of size n, sort the array using Merge Sort.

Examples:

Example 1:
Input: N=5, arr[]={4,2,1,6,7}
Output: 1,2,4,6,7,


Example 2:
Input: N=7,arr[]={3,2,8,5,1,4,23}
Output: 1,2,3,4,5,8,23

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort
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

        mergeSort(arr,n);

        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr,int n)
    {
        mergeSort(arr,0,n-1);
    }

    private static void mergeSort(int[] arr,int low,int high)
    {
        if(low>=high)
            return;

        int mid = low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr,int low,int mid,int high)
    {
        ArrayList<Integer> temp = new ArrayList<>();

        int left=low, right=mid+1;

        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else
            {
                temp.add(arr[right]);
                right++;
            }
        }

        while(left<=mid)
        {
            temp.add(arr[left]);
            left++;
        }

        while(right<=high)
        {
            temp.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++)
        {
            arr[i]=temp.get(i-low);
        }

    }
}
