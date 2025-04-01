/*

Write a program that accepts two integers, nn and mm, and prints all prime numbers between nn and mm (inclusive) such that the sum of their digits is also a prime number.

Example 1:
Input : 20 25
Output : 23

*/

import java.util.Scanner;

public class PrimeRangeSum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int nn = in.nextInt();
        int mm = in.nextInt();

        // Ensure nn is less than or equal to mm
        if (nn > mm)
        {
            int temp = nn;
            nn = mm;
            mm = temp;
        }

        for(int i=nn;i<=mm;i++)
        {
            if(primeSumCheck(i))
                System.out.print(i+" ");
        }

    }

    private static boolean primeSumCheck(int n)
    {
        int sum = findSum(n);

        // Check if both the number and the sum of its digits are prime
        return prime(n) && prime(sum);
    }

    private static int findSum(int n)
    {
        int s = 0;

        while(n!=0)
        {
            int d = n%10;
            s=s+d;
            n=n/10;
        }

        return s;
    }

    private static boolean prime(int n)
    {
        if(n<2)
            return false;

        // Check divisibility by 2 first
        if (n == 2) return true;

        // Skip even numbers greater than 2
        if (n % 2 == 0) return false;

        for(int i=3;i*i<=n;i+=2)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
