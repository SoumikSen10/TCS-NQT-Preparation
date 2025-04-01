/*

We are given a list of numbers we need to return maximum difference b/w smallest and largest number.

Note : smallest number should be before largest number.

Example :
I/O :   n = 7
       {-3,-5,1,6,-7,8,11}

O/P :   18

*/

import java.util.Scanner;

public class MaxDifference
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        int smallest = arr[0], maxDiff = Integer.MIN_VALUE;

        for(int i=1;i<n;i++)
        {
            maxDiff = Math.max(maxDiff,arr[i]-smallest); // Ensures smallest comes before largest
            smallest = Math.min(smallest,arr[i]); // updating minimum
        }

        System.out.print(maxDiff);

    }
}
