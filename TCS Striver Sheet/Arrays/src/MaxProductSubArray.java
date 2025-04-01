/*

Problem Statement: Given an array that contains both negative and positive integers, find the maximum product subarray.

Examples
Example 1:
Input:

 Nums = [1,2,3,4,5,0]

Output:
 120

Explanation:
 In the given array, we can see 1×2×3×4×5 gives maximum product value.


Example 2:
Input:
 Nums = [1,2,-3,0,-4,-5]

Output:
 20

Explanation:
 In the given array, we can see (-4)×(-5) gives maximum product value.

*/

import java.util.Scanner;

public class MaxProductSubArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int ans = maxProductSubArray(arr,n);
        System.out.print(ans);

    }

    private static int maxProductSubArray(int[] arr, int n)
    {
        int prod = Integer.MIN_VALUE;
        int pre = 1, suff = 1;

        for(int i=0;i<n;i++)
        {
            if(pre==0)
                pre=1;
            if(suff==0)
                suff=1;

            pre = pre * arr[i];
            suff = suff * arr[n-i-1];
            prod = Math.max(prod,Math.max(pre,suff));
        }
        return prod;
    }
}

/*

Algorithm:

We will first declare 2 variables i.e. ‘pre’(stores the product of the prefix subarray) and ‘suff’(stores the product of the suffix subarray).

They both will be initialized with 1(as we want to store the product).

Now, we will use a loop(say i) that will run from 0 to n-1.

We have to check 2 cases to handle the presence of 0:

i)  If pre = 0: This means the previous element was 0. So, we will consider the current element as a part of the new subarray. So, we will set ‘pre’ to 1.

ii) If suff = 0: This means the previous element was 0 in the suffix. So, we will consider the current element as a part of the new suffix subarray. So, we will set ‘suff’ to 1.

Next, we will multiply the elements from the starting index with ‘pre’ and the elements from the end with ‘suff’. To incorporate both cases inside a single loop, we will do the following:

We will multiply arr[i] with ‘pre’ i.e. pre *= arr[i].

We will multiply arr[n-i-1] with ‘suff’ i.e. suff *= arr[n-i-1].

After each iteration, we will consider the maximum among the previous answer, ‘pre’ and ‘suff’ i.e. max(previous_answer, pre, suff).

Finally, we will return the maximum product.

*/