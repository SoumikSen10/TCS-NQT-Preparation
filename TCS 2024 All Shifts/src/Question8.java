/*

Given an integer array arr, return the number of distinct bitwise ORs of all the non-empty subarrays of arr.The bitwise OR of a subarray is the bitwise OR of each integer in the subarray. The bitwise OR of a subarray of one integer is that integer.A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:

Input: arr= [0]

Explanation: There is only one possible result: 0.

Output: 1

Example 2:

Input: arr [1,1,2]

Output: 3

Explanation: The possible subarrays are [1], [1], [2], [1, 1], [1, 2], [1, 1, 2].These yield the results 1, 1, 2, 1, 3, 3. There are 3 unique values, so the answer is 3.

Example 3:

Input: arr = [1,2,4]

Output: 6

Explanation: The possible results are 1, 2, 3, 4, 6, and 7.

*/

import java.util.*;

public class Question8
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        int ans = compute(arr,n);
        System.out.print(ans);
    }

    private static int compute(int[] arr,int n)
    {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int or = 0;
            for(int j=i;j<n;j++)
            {
                or = or | arr[j];
                set.add(or);
            }
        }

        return set.size();
    }
}
