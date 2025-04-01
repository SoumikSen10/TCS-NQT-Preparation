/*

Problem Statement: Find all the repeating elements present in an array.

Examples:

Example 1:
Input:
Arr[] = [1,1,2,3,4,4,5,2]
Output:
 1,2,4
Explanation:
 1,2 and 4 are the elements which are occurring more than once.

Example 2:
Input:
 Arr[] = [1,1,0]
Output:
 1
Explanation:
 Only 1 is occurring more than once in the given array.

*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindRepeatingElements
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        showRepeating(arr,n);

    }

    private static void showRepeating(int[] arr, int n)
    {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> element : map.entrySet())
        {
            if(element.getValue()>1)
                System.out.print(element.getKey()+" ");
        }
    }
}
