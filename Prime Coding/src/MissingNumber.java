/*

Given an array of size n-1 with integers in the range of [1,n], the task is to find the missing number from the first n integers.

Example 1:

Input :
4
1 2 3 5

Output :
4

Example 2:

Input :
3
1 2 4

Output :
3

*/

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  // Read the value of n
        int arr[] = new int[n - 1];  // Array size is n-1 because we're given n-1 elements

        // Read n-1 elements
        for (int i = 0; i < n - 1; i++) {
            arr[i] = in.nextInt();
        }

        // Find the missing number
        int ans = findMissing(arr, n);
        System.out.print(ans);
    }

    private static int findMissing(int[] arr, int n)
    {
        int sum1 = 0, sum2 = 0;

        // Sum of elements in the array (n-1 elements)
        for (int i : arr)
        {
            sum1 += i;
        }

        // Sum of the first n natural numbers (including the missing number)
        sum2 = n * (n + 1) / 2;

        // The missing number is the difference between the sums
        return sum2 - sum1;
    }
}
