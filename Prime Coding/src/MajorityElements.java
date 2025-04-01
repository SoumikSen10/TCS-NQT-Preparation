/*

Find majority elements.
Majority Elements are the elements which occurs more than or equal to n/2 times the array, where 'N' is the size of the array.

Input : 6
        2 4 2 4 2 4

Output : 2,4

*/

import java.util.*;

public class MajorityElements
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        Map<Integer,Integer> freq = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }

        int threshold = (int) Math.ceil(n / 2.0); // Ensure correct majority threshold

        for(Map.Entry<Integer,Integer> element : freq.entrySet())
        {
           if(element.getValue() >= threshold)
               System.out.print(element.getKey() + " ");
        }

    }
}
