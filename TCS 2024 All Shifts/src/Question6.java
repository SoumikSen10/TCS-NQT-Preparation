/*

Given an array and an integer k.we need to find the maximum element in each of the contiguous subarrays.

Input: 247163

K=3

Output:7776

The subarrays will be [2,4,7], [4,7,1],[7,1,6] and [1,6,3]. The maximum numbers from the subarrays are

7 7 7 6

*/

import java.util.*;

public class Question6
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String n = in.next();

        int arr[] = new int[n.length()];

        for(int i=0;i<n.length();i++)
            arr[i] = n.charAt(i)-'0'; // Convert char to int

        int k = in.nextInt();

        int ans = compute(arr,arr.length,k);
        System.out.print(ans);

    }

    private static int compute(int[] arr,int n,int k)
    {
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<=n-k;i++)
        {
            int x = findMax(arr,i,i+k);
            ans.append(x);
        }

        return Integer.parseInt(ans.toString());
    }

    private static int findMax(int[] arr,int start,int end)
    {
        int maxi = Integer.MIN_VALUE;
        for(int i=start;i<end;i++)
        {
            maxi = Math.max(maxi,arr[i]);
        }

        return maxi;
    }
}
