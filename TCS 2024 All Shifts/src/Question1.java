/*

SUBARRAY-SUM-EQUALS-K

Given a sequence of integers, referred to as ‘nums’, and another integer ‘k’, the task is to find the total count of subarrays where the sum equals ‘k’. A subarray is defined as a continuous, non-empty sequence of elements within the array.

Example 1:

Input: nums = [1,1,1], k = 2

Output: 2

Example 2:

Input: nums = [1,2,3], k = 3

Output: 2

Constraints:

The length of ‘nums’ is between 1 and 2 * 10^4 inclusive.
Each element in ‘nums’ is between -1000 and 1000 inclusive.
‘k’ is between 10^7 and 10^7 inclusive.

*/

import java.util.HashMap;
import java.util.Scanner;

public class Question1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[] = new int[n];

        for(int i=0;i<n;i++)
            nums[i]=in.nextInt();

        int k = in.nextInt();

        int ans = computeOptimized(nums,n,k);
        System.out.print(ans);

    }

    // only valid when all positive numbers in array
    private static int compute(int[] nums,int n,int k)
    {
        int sum = 0,i=0,j=0,cnt=0;

        while(j<n)
        {
            sum = sum + nums[j];

            while(sum > k && i<=j)
            {
                sum = sum - nums[i];
                i++;
            }

            if(sum==k)
            {
                cnt++;
            }

            j++;
        }

        return cnt;
    }


    //valid for both positives and negatives in array using prefixSum concept
    private static int computeOptimized(int[] nums,int n,int k)
    {
       HashMap<Integer,Integer> prefixSumCount = new HashMap<>();
       prefixSumCount.put(0,1); // Base case: to get sum = 0

        int prefixSum = 0,cnt = 0;

        for(int i=0;i<n;i++)
        {
            prefixSum = prefixSum + nums[i];

            // If (prefixSum - k) was seen before, adding freq to count
            cnt = cnt + prefixSumCount.getOrDefault(prefixSum-k,0);

            // storing prefixSum
            prefixSumCount.put(prefixSum,prefixSumCount.getOrDefault(prefixSum,0)+1);

        }

        return cnt;
    }
}
