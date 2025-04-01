/*

Problem Statement: Find all the non-repeating elements for a given array. Outputs can be in any order.

Examples:

Example 1:
Input:
 Nums = [1,2,-1,1,3,1]
Output:
 2,-1,3
Explanation:
 1 is the only element in the given array which occurs thrice in the array. -1,2,3 occurs only once and hence, these are non-repeating elements of the given array.

Example 2:
Input:
 Nums = [1,2,3]
Output:
 1,2,3
Explanation:
 All elements present in the array occur once. Hence, every element is non-repeating.

*/


import java.util.*;

public class FindNonRepeating
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[] = new int[n];

        for(int i=0;i<n;i++)
            nums[i]=in.nextInt();

        findNonRepeating(nums,n);
    }

    private static void findNonRepeating(int[] nums,int n)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> element : map.entrySet())
        {
            if(element.getValue()==1)
                System.out.print(element.getKey()+" ");
        }

    }

}
