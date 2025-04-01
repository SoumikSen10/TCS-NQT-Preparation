/*

**Consider the following series:** 1, 1, 2, 3, 4, 7, 8, 15, 9, 24, 16, 40, 32, 72, 104, 27 ...

This series is a mixture of 3 series –
- All the prime position values are power of 2.
- All the perfect square position are power of 3.
- Remaining positions are sum of previous 2 values.

For example , if N=15, the 15th term in the series is 104, so only value 104 should be printed to STDOUT.

You can assume that N will not exceed 40.

*/

import java.util.Scanner;

public class MixtureSeries
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int arr[] = new int[40];

        int pos=0;

        // Initialize the first two terms
        arr[0] = 1;
        arr[1] = 1;

        int primeCount = 0; // Counter for prime positions
        int perfectSquareCount = 0; // Counter for perfect square positions

        for(int i=2;i<40;i++)
        {
            pos = i+1;

            if(prime(pos))
            {
                arr[i] = (int) Math.pow(2, ++primeCount);
            }
            else if(perfectsq(pos))
            {
                arr[i] = (int) Math.pow(3, ++perfectSquareCount);
            }
            else
            {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }

        System.out.println(arr[N-1]);
    }

    private static boolean prime(int n)
    {
        if (n < 2)
            return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    private static boolean perfectsq(int n)
    {
        if(n<0)
            return false;
        return (int)Math.sqrt(n)*(int)Math.sqrt(n) == n;
    }
}
