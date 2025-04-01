/*

Problem Statement: Given a string, return the character that occurs the maximum number of times in the string. If the maximum occurrence of two or more characters is the same, return any one of them.

Examples:

Example 1:
Input: str = “takeuforward”
Output: a
Explanation: The character 'a' and 'r’ have the same  maximum occurrence i.e 2. Hence we can print any one of them

Example 2:
Input: str = “apple”
Output: p
Explanation: The character 'p' have the maximum occurrence i.e 2.

*/

import java.util.Scanner;

public class MaxCharInString
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        char ch = maxOccurence(str);
        System.out.print(ch);

    }

    private static char maxOccurence(String str)
    {
        int[] freq = new int[256];

        char maxChar='\0';
        int maxi=Integer.MIN_VALUE;

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            freq[ch]++;

            if(freq[ch]>maxi)
            {
                maxi = freq[ch];
                maxChar = ch;
            }
        }

        return maxChar;

    }
}
