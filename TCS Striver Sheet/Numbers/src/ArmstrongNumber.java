/*

Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.

An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

Examples
Example 1:
Input:N = 153
Output:True
Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153
Example 2:
Input:N = 371
Output: True
Explanation: 33+53+13 = 27 + 343 + 1 = 371

*/

import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(armstrongCheck(n))
            System.out.print("True");
        else
            System.out.print("False");

    }

    private static boolean armstrongCheck(int n)
    {
        int x = n,cnt=countDigits(n),s=0;

        while(x!=0)
        {
            int d = x%10;
            s = s + (int)Math.pow(d,cnt);
            x=x/10;
        }

        return n==s;
    }

    private static int countDigits(int x)
    {
        int cnt=0;
        while(x!=0)
        {
            cnt++;
            x=x/10;
        }
        return cnt;
    }
}
