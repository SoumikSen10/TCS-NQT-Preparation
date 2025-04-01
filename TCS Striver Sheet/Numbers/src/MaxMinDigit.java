/*

Problem Statement: Given a number N, print the smallest and largest digits present in the number.

Examples:

Example 1:
Input: N = 2746
Output: Largest digit: 7
        Smallest digit: 2
Explanation: By simply going through the digits of
the number, we figure out the largest and smallest
digit in the number.

Example 2:
Input: N = 23004
Output: Largest digit : 4
        Smallest digit : 0
Explanation: By simply going through the digits of
the number, we figure out the largest and smallest
digit in the number.

*/

import java.util.Scanner;

public class MaxMinDigit
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int res[] = computeMaxMinDigits(Math.abs(n));

        System.out.println("Largest digit : "+res[1]);
        System.out.print("Smallest digit : "+res[0]);

    }

    private static int[] computeMaxMinDigits(int n)
    {
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;

        while(n!=0)
        {
            int d = n%10;
            mini = Math.min(mini,d);
            maxi = Math.max(maxi,d);
            n = n/10;
        }

        return new int[]{mini,maxi};
    }
}
