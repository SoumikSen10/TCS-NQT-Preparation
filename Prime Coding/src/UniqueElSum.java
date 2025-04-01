/*

Sum of Unique Elements

You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
Return the sum of all the unique elements of nums.

Example 1:

Input :
nums = [1,2,3,4]

Output :
10

Explanation : [1,2,3,4] and the sum is 10.

Example 2 :

Input :
nums = [1,1,1,1,1]

Output :
0

*/

import java.util.*;

public class UniqueElSum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        int ans = findSum(arr);
        System.out.print(ans);
    }

    private static int findSum(int[] arr)
    {
        // Use a HashMap to count frequencies of each element
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int el : arr)
        {
            freqMap.put(el, freqMap.getOrDefault(el, 0) + 1);
        }

        int sum = 0;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet())
        {
            if (entry.getValue() == 1)
            {
                sum += entry.getKey();
            }
        }

        return sum;

    }
}
