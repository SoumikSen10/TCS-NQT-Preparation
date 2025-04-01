/*

Check if array is subset of another array.

Write a program to find whether an array is a subset of another array or not.

Given arr1[] and arr2[], we need to find whether arr1[] is a subset of arr2[]. An array is called a subset of another if all of its elements are present in the other array.

Note: Array elements are assumed to be unique.

Examples:

Example 1:
Input: arr1[]= [1,3,4,5,2]
       arr2[]= [2,4,3,1,7,5,15]
Output: arr1[] is a subset of arr2[]

Example 2:
Input: arr1[]= [1,3,4,5,2]
       arr2[]= [4,5,2]
Output: arr1[] is not a subset of arr2[]

Example 3:
Input: arr1[]= [1,3,4,5,2]
       arr2[]= [11,12,13,15,16]
Output: arr1[] is not a subset of arr2[]

*/

import java.util.*;

public class SubsetOfOtherArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int arr1[] = new int[n1];

        for(int i=0;i<n1;i++)
            arr1[i]=in.nextInt();

        int n2 = in.nextInt();
        int arr2[] = new int[n2];

        for(int i=0;i<n2;i++)
            arr2[i]=in.nextInt();

        boolean ans = isSubset(arr1,n1,arr2,n2);
        System.out.print(ans);

    }

    private static boolean isSubset(int[] arr1, int n1, int[] arr2, int n2)
    {
        if(n1>n2)
            return false;

        Map<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<n2;i++)
        {
            map.put(arr2[i],true);
        }

        for(int i=0;i<n1;i++)
        {
            if(!map.containsKey(arr1[i]))
                return false;
        }
        return true;
    }
}
