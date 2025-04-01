/*

Find subarrays with a given sum in array. Given integer array find subarrays with a given sum in it.

I/P : arr = [3,4,-7,1,3,3,1,-4]
      target = 7

O/P : [3,4]
      [3,4,-7,1,3,3]
      [1,3,3]
      [3,3,1]

*/

import java.util.*;

public class SubarrayTargetSum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        int target = in.nextInt();
        printSubArraysOptimized(arr,n,target);

    }

    private static void printSubArrays(int[] arr,int n,int target)
    {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            int sum = 0;
            List<Integer> temp = new ArrayList<>();

            for (int j = i; j < n; j++)
            {
                sum = sum + arr[j];
                temp.add(arr[j]);


                if (sum == target)
                    ans.add(new ArrayList<>(temp));
            }
        }

        for(List<Integer> list : ans)
        {
            System.out.println(list);
        }
    }

    private static void printSubArraysOptimized(int[] arr,int n,int target)
    {
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int curSum = 0;

        // Initialize sumMap to handle subarrays starting from index 0
        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1); // Because subarray can start from index 0

        for (int i = 0; i < n; i++)
        {
            curSum += arr[i];

            // If (curSum - target) exists, we have found subarrays
            if (sumMap.containsKey(curSum - target))
            {
                List<Integer> startIndexes = sumMap.get(curSum - target);
                for (int startIndex : startIndexes)
                {
                    // Print the subarray explicitly using loops
                    for (int k = startIndex + 1; k <= i; k++)
                    {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }

            // Store the current sum in the map
            sumMap.putIfAbsent(curSum, new ArrayList<>());
            sumMap.get(curSum).add(i);
        }

    }
}
