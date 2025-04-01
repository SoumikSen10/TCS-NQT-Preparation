/*

Given size of n and list of array elements and we should print if the given element in array is divisible by 3 then replace the element with "Three" and if the element in array is divisible by 5 then replace the element with "Five", if the element is divisible by both 3 and 5 then replace the element with "ThreeFive", if the element in the array is not satisfying the above 3 conditions then put the element as it is and print the array.

Example 1 :

Input :
N = 4
[2 3 4 5]

Output :
2 Three 4 Five

Example 2 :

Input :
N = 2
[15 3]

Output :
ThreeFive Three

*/

import java.util.Scanner;

public class ThreeFive
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();

        StringBuilder ans = new StringBuilder();

        for(int i=0;i<n;i++)
        {
            if(arr[i]%3 == 0 && arr[i]%5 == 0)
                ans.append("ThreeFive ");
            else if(arr[i]%3 == 0)
                ans.append("Three ");
            else if(arr[i]%5 == 0)
                ans.append("Five ");
            else
                ans.append(arr[i]+" ");
        }

        System.out.println(ans.toString().trim());
    }
}
