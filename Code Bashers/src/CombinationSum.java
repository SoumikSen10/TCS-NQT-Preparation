/*

Write a program to find the sum of all characters and all possible contiguous character combinations from the given string.

Consider the string S1 = "321".

All characters and combinations of contiguous characters from the above string are: 3, 2, 1, 32, 21, 321.

Adding all the numbers (3 + 2 + 1 + 32 + 21 + 321), we get 380 as the result.

Instructions:
The system does not allow any kind of hard-coded input values.
The written program code by the candidate will be verified against the inputs that are supplied from the system.
For more clarification, please read the following points carefully till the end.

Example 1:
Input: 321
Output: 380

*/

import java.util.Scanner;

public class CombinationSum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int sum = combinationSum(s);
        System.out.println(sum);

    }

    private static int combinationSum(String s)
    {
        int sum=0,n=s.length();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                String s1=s.substring(i,j+1);
                sum+=Integer.parseInt(s1);
            }
        }
        return sum;
    }

    //optimal approach
    /*
    private static int combinationSum(String s) {
        int n = s.length();
        long sum = 0;
        long currentValue = 0;

        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';

            // Compute new number's contribution dynamically
            currentValue = currentValue * 10 + (digit * (i + 1));
            sum += currentValue;
        }

        return (int) sum;
    }*/

}
