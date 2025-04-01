/*

Given an array and an integer k, we need to find the maximum element in each of the contiguous subarrays.

Input : 2 4 7 1 6 3
k = 3
Output : 7 7 7 6

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxInSubarray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        int k = in.nextInt();
        compute(arr,n,k);
    }

    private static void compute(int[] arr, int n, int k)
    {
        List<Integer> ans = new ArrayList<>();

        int maxi;
        for(int i=0;i<=n-k;i++)
        {
            maxi = arr[i];
            for(int j=i;j<i+k;j++)
            {
                maxi = Math.max(maxi,arr[j]);
            }
            ans.add(maxi);
        }

        System.out.println(ans);
    }

    private static void computeOptimized(int[] arr,int n,int k)
    {
        if(n*k == 0)
            return;

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        //Compute prefix sum
        for(int i=0;i<n;i++)
        {
            if(i%k==0)
                prefix[i] = arr[i];
            else
                prefix[i] = Math.max(prefix[i-1],arr[i]);
        }

        //Compute suffix sum
        for(int i=n-1;i>=0;i--)
        {
            if(i == n-1 || (i+1)%k == 0)
                suffix[i] = arr[i];
            else
                suffix[i] = Math.max(suffix[i+1],arr[i]);
        }

        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<=n-k;i++)
        {
            ans.add(Math.max(prefix[i+k-1],suffix[i]));
        }

        System.out.println(ans);

    }
}

/*

Key Idea
Instead of checking every subarray individually (which is slow), we precompute useful information in two passes over the array.

We divide the array into blocks of size k.

We compute:

Prefix Max: Maximum from the start of a block up to each index.
Suffix Max: Maximum from the end of a block up to each index.
Then, for each window [i, i + k - 1], the maximum is calculated.

*/