/*

In a company there are employees and their efficiency is given in array 'arr' (can be negative) you need to find the maximum efficiency of 3 employees. The efficiency of 3 employees will be calculated by multiplying their individual efficiencies from the given array.

Example 1:

I/O :
5
3 -2 -8 4 1

O/P :
64

*/

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeEfficiency
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        int ans = compute(arr,n);
        System.out.print(ans);
    }

    private static int compute(int[] arr,int n)
    {
        Arrays.sort(arr);

        int emp1 = arr[n-1];
        int emp2 = arr[n-2];
        int emp3 = arr[n-3];

        //negative case
        int neg1 = arr[0];
        int neg2 = arr[1];

        return Math.max(emp1 * emp2 * emp3, neg1 * neg2 * emp1);
    }
}

/*

Sort the Array:

Sorting helps in easily accessing the largest and smallest elements.
The largest three numbers will be at the end of the sorted array, while the smallest (including negative numbers) will be at the beginning.
Two Possible Cases to Consider:

Case 1: The three largest numbers (last three in sorted order) give the maximum product.
Case 2: If the smallest two numbers (which can be negative) and the largest number give a greater product, use that.
Final Answer:

The maximum of both cases is taken to ensure the correct result.

*/
