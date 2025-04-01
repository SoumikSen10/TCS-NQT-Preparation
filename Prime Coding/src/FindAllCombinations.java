/*

Print all combinations.

Input :
3 0 1 2
3 - is the size of the array

Output :
0, 0 1, 0 1 2, 1, 1 2, 2

*/

import java.util.Scanner;

public class FindAllCombinations
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        printCombinationsOptimized(arr,n);
    }

    private static void printCombinations(int[] arr, int n)
    {
        boolean first = true; // Flag to track first element

        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {
                if(!first)
                {
                    System.out.print(" , ");
                }
                first = false;
                // Print elements from i to j
                for (int k = i; k <= j; k++)
                {
                    System.out.print(arr[k]);
                    if (k < j) System.out.print(" ");
                }
            }
        }
    }

    private static void printCombinationsOptimized(int[] arr, int n)
    {
        StringBuilder res = new StringBuilder();

        for(int i=0;i<n;i++)
        {
            StringBuilder subarray = new StringBuilder();
            for(int j=i;j<n;j++)
            {
                if(subarray.length()>0)
                    subarray.append(" "); //append space between elements
                subarray.append(arr[j]);

                //append subarray to result
                if(res.length()>0)
                    res.append(", ");
                res.append(subarray);
            }
        }

        System.out.println(res);

    }
}
