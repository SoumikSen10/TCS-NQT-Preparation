/*

Problem Statement: Search an element in an array and return its position

Examples:

Example 1:
Input: array[] = {1,2,3,4,5}
k=3
Output: 2
Explanation: The answer is 2 because 3 is present at 2nd index.

Example 2:
Input: array[]={6,7,9,5,3,10} k=10
Output: 5
Explanation: The answer is 5 because 10 is present at 5th index.

*/

import java.util.Scanner;

public class SearchElement
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int k = in.nextInt();

        //int pos = linearSearch(arr,n,k);
        int pos = binarySearch(arr,n,k);
        System.out.print(pos);

    }

    private static int linearSearch(int[] arr,int n,int k)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
                return i;
        }
        return -1;
    }

    private static int binarySearch(int[] arr,int n,int k)
    {
        int left=0,right=n-1;
        while(left<=right)
        {
            int mid = left + (right-left)/2;
            if(arr[mid]==k)
                return mid;
            else if(arr[mid]>k)
                right=mid-1;
            else if(arr[mid]<k)
                left=mid+1;
        }
        return -1;
    }
}
