/*

A person has many shoes of different sizes and he wants to arrange them. Calculate the number of pairs of shoes.

Example 1:

I/P :
8
7L 7R 7L 8L 6R 7R 8R 6R

O/P : 3

Example 2:

I/P :
5
7R 7L 8R 10R 10L

O/P : 2

*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PairOfShoes
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String[] arr = new String[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = in.next();
        }

        int ans = solve(arr,n);
        System.out.print(ans);

    }

    private static int solve(String arr[], int n)
    {

        Map<String,Integer> freq = new HashMap<>();

        int pairs = 0;
        for(int i=0; i<n;i++)
        {
           freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }

        // Iterate over the frequency map to count pairs
        for (String el : freq.keySet())
        {
            if (el.endsWith("L"))
            {
                String opposite = el.substring(0, el.length() - 1) + "R";

                if (freq.containsKey(opposite))
                {
                    pairs += Math.min(freq.get(el), freq.get(opposite));
                    freq.put(opposite, 0); // Mark as counted to prevent double counting
                }
            }
        }

        return pairs;
    }
}
