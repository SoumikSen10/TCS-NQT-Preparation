/*

Problem Statement: Given an array of pairs, find all the symmetric pairs in the array.

Examples:

Example 1:
Input: (1,2),(2,1),(3,4),(4,5),(5,4)
Output: (2,1) (5,4)
Explanation: Since (1,2) and (2,1) are symmetric pairs and (4,5) and (5,4) are symmetric pairs.

Example 2:
Input: (1,5),(2,3),(4,2),(5,1),(2,4)
Output: (2,4) (5,1)
Explanation: Since (1,5) and (2,4) are symmetric pairs and (5,1) and (4,2) are symmetric pairs.

*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SymmetricPairs
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[][] = new int[n][2];

        for(int i=0;i<n;i++)
        {
                arr[i][0] = in.nextInt();
                arr[i][1] = in.nextInt();
        }

        symmetricHelper(arr,n);

    }

    private static void symmetricHelper(int[][] arr, int n)
    {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            int first = arr[i][0];
            int second = arr[i][1];

            if(map.get(second) !=null && map.get(second) == first)
            {
                System.out.print("("+first+" "+second+")");
            }

            else
            {
                map.put(first,second);
            }

        }

    }

}

/*

Understanding Symmetric Pairs
A symmetric pair means:

If (a, b) exists in the array, then (b, a) should also exist.
Example: (1,2) and (2,1) are symmetric.
Why Check (second, first)?
When iterating through the array:

If (a, b) is encountered first, store it in the map as { a → b }.
If later (b, a) is encountered, check if { b → a } already exists in the map.
If it does, it means (a, b) and (b, a) are symmetric.


Small example :

First pair (1,2)
Store it in the map: { 1 → 2 }
Second pair (2,1)
Check if map.containsKey(1) && map.get(1) == 2 → ✅ Found!
Output (2,1)

*/