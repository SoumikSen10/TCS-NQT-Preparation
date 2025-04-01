/*

Problem Statement: Given an unsorted array, remove duplicates from the array.

Examples:

Example 1:
Input: arr[]={2,3,1,9,3,1,3,9}
Output:  {2,3,1,9}

Explanation: Removed all the duplicate elements

Example 2:
Input: arr[]={4,3,9,2,4,1,10,89,34}
Output: {3,4,9,2,1,10,34,89}
Explanation: Removed all the duplicate elements

*/

import java.util.*;

public class RemoveDuplicatesUnsortedArr
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        duplicateHandler(arr,n);
    }

    private static void duplicateHandler(int[] arr, int n)
    {
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            if(!set.contains(arr[i]))
            {
                System.out.print(arr[i]+" ");
                set.add(arr[i]);
            }
        }

    }
}
