/*

Problem Statement: Find permutations in which n people can occupy r seats in a classroom.

Examples:

Example 1:
Input: N = 5, r = 3
Output: 60
Explanation: To permute n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! Is 60.

Example 2:
Input: N=6,r = 4.
Output: 360

*/

import java.util.Scanner;

public class NPeoplePermutation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();

        if(n<r)
            System.out.print("Invalid");
        else
        {
            System.out.print(permute(n,r));
        }

    }

    private static long permute(int n, int r)
    {
        return fact(n) / fact(n-r);
    }

    private static long fact(int n)
    {
        long f = 1;

        for(int i=1;i<=n;i++)
            f = f*i;

        return f;
    }
}
