/*

Question :

Given array of N integers , task is to replace elements with its rank in the array.:

Example 1 :
Input:** 20 15 26 2 98 6
Output: 4 3 5 1 6 2

**Explanation:** When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,rank of 15 is 3 and so…

Example 2 :
Input: 1 5 8 15 8 25 9
Output: 1 2 3 5 3 6 4

Explanation: When sorted,the array is 1,5,8,8,9,15,25. So the rank of 1 is 1,rank of 5 is 2,rank of 8 is 3 and so…

*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class RankedArray
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        int[] res = compute(arr,n);
        System.out.println(Arrays.toString(res));

    }

    private static int[] compute(int[] arr,int n)
    {
        int[] res = new int[n];

        for(int i=0;i<n;i++)
        {
            res[i]=arr[i];
        }

        Arrays.sort(arr);

        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;

        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],rank);
                rank++;
            }
        }

        for(int i=0;i<n;i++)
        {
            res[i]=map.get(res[i]);
        }

        return res;
    }
}
