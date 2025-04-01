/*

Problem Statement: Given an array, we have to find the largest element in the array.

Examples
Example 1:
Input:
 arr[] = {2,5,1,3,0};
Output:
 5
Explanation:
 5 is the largest element in the array.

Example2:
Input:
 arr[] = {8,10,5,7,9};
Output:
 10
Explanation:
 10 is the largest element in the array.

*/

import java.util.Scanner;

public class LargestNo
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        int maxi = findLargest(arr,n);
        System.out.print(maxi);
    }

    private static int findLargest(int[] arr, int n)
    {
        int maxi = arr[0];

        for(int i=1;i<n;i++)
        {
            maxi = Math.max(maxi,arr[i]);
        }
        return maxi;
    }

}
