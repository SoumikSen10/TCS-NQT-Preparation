/*

Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

Note: Return k after placing the final result in the first k slots of the array.

Examples
Example 1:
Input:
 arr[1,1,2,2,2,3,3]

Output:
 arr[1,2,3,_,_,_,_]

Explanation:
 Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

Example 2:
Input:
 arr[1,1,1,2,2,3,3,3,3,4,4]

Output:
 arr[1,2,3,4,_,_,_,_,_,_,_]

Explanation:
 Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.

*/

import java.util.*;

public class RemoveDuplicatesSortedArr
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        //int k = compute(arr,n);
        int k = computeOptimized(arr,n);

        System.out.println(k);

        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }

    private static int compute(int[] arr,int n)
    {
        Set<Integer> set = new TreeSet<>();

        for(int i=0;i<n;i++)
            set.add(arr[i]);

        int k=set.size();
        int j=0;

        for(int x : set)
            arr[j++]=x;

        return k;

    }

    private static int computeOptimized(int[] arr,int n)
    {
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
