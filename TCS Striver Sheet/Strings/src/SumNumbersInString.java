/*

Problem: Given a string, calculate the sum of numbers in a string (multiple consecutive digits are considered one number)

Examples:

Example 1:
Input: string = “123xyz”
Output: 123

Example 2:
Input: string = “1xyz23”
Output: 24

*/

import java.util.Scanner;

public class SumNumbersInString
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int ans = compute(s);
        System.out.println(ans);

    }

    private static int compute(String s)
    {
        int sum = 0;
        String number = "";

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9')
            {
                number = number+ch;
            }
            else
            {
                sum = sum + Integer.parseInt(number);
                number = "0";
            }
        }

        return sum + Integer.parseInt(number); // for last number formed

    }
}

/*

Intuition :

We will iterate in the whole string, if we encounter consecutive numbers we will store them in a temporary string.
After the end of consecutive numbers, we will add them to our final result. This process goes on till we reach the end of the string.
At the end, we will print the sum.
Approach:

We will use a tempSum string to store the number
Using a for loop we will iterate through the string and if we encounter a number we will add this number to our tempSum.
If we encounter an alphabet , we will add the value of tempSum to the final result and empty the tempSum to get a new number in the string.
Finally we print the result.

*/